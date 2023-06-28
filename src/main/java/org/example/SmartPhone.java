package org.example;

public class SmartPhone extends SmartDevice {
    private String operatingSystem;
    private int screenSize;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, double price, String operatingSystem, int screenSize) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        return super.toString() + ", OS: " + operatingSystem + ", Screen Size: " + screenSize + " inches";
    }

}