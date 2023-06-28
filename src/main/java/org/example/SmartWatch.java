package org.example;

public class SmartWatch extends SmartDevice {
    private String displayType;
    private boolean heartRateMonitor;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, double price, String displayType, boolean heartRateMonitor) {
        super(brand, model, price);
        this.displayType = displayType;
        this.heartRateMonitor = heartRateMonitor;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        String hasHeartRateMonitor = heartRateMonitor ? "Yes" : "No";
        return super.toString() + ", Display Type: " + displayType + ", Heart Rate Monitor: " + hasHeartRateMonitor;
    }
}
