package com.example.Unit73.builder;

public class BuilderMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new
                BankAccount.Builder(123).withBalance(54).withOwner("Gubbi").build();
        System.out.println(bankAccount);

        Student st = new
                Student.StudentBuilder("A.A.E.").withAge(56).withCourse(4).withSpeciality("MBA").build();
        System.out.println(st);

        Phone phone = new
                Phone.PhoneBuilder("G20E17").withCountry("KG").withPrice(58000).withDateOfManufacture("2019")
                .withInStock(true).build();
        System.out.println(phone);
    }
}
