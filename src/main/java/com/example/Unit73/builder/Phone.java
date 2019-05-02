package com.example.Unit73.builder;

public class Phone {
    private String model;
    private String country;
    private Integer price;
    private String dateOfManufacture;
    private boolean inStock;

    private Phone() {
    }

    public static class PhoneBuilder {
        private String model;
        private String country;
        private Integer price;
        private String dateOfManufature;
        private boolean inStock;

        public PhoneBuilder(String model) {
            this.model = model;
        }

        public PhoneBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public PhoneBuilder withPrice(Integer price) {
            this.price = price;
            return this;

        }

        public PhoneBuilder withDateOfManufacture(String dateOfManufacture) {
            this.dateOfManufature = dateOfManufacture;
            return this;
        }

        public PhoneBuilder withInStock(boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.model = this.model;
            phone.country = this.country;
            phone.price = this.price;
            phone.dateOfManufacture = this.dateOfManufature;
            phone.inStock = this.inStock;
            return phone;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
