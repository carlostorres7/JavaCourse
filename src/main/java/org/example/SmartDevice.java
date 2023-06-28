package org.example;

public class SmartDevice {
    private String brand;
    private String model;
    private double price;

    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price;
    }




}
