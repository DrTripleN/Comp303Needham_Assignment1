package com.example.nahanielneedham_comp303_assignment1;

public class Order {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String province;
    private String zipcode;
    private String brand;
    private String model;
    private double price;
    private int quantity;

    // Constructor, getters, and setters
    public Order() {}

    public Order(String name, String email, String phone, String address,String province,String zipcode, String brand, String model, double price, int quantity) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.province = province;
        this.zipcode = zipcode;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getProvince(){
        return province;
    }
    public String getAddress() {
        return address;
    }
    public String getZipcode(){
        return zipcode;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 public double calculateTotalPrice() {
        return this.price * this.quantity;
 }

}
