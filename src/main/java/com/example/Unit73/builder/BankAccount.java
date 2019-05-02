package com.example.Unit73.builder;

public class BankAccount {
    private long accountNumber;
    private String owner;
    private double balance;

    private BankAccount(){}

    public static class Builder{
        private long accountNumber;// должен быть в конструкторе, так кк он обязательный
        private String owner;
        private double balance;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public Builder withOwner(String owner){
            this.owner = owner;
            return this;

        }
        public Builder withBalance(double balance){
            this.balance = balance;
            return this;
        }

        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.balance = this.balance;
            account.owner = this.owner;
            return account;
        }
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
