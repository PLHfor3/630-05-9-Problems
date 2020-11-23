package com.gmail.prestonhigg17.Battery;

public class BatteryClass {
    private double capacity; // Battery capacity in mAh
    private double voltage; // Battery Voltage in volts

    public BatteryClass() {

    }

    public void BatteryClass (double capacity, double voltage) {
        this.capacity = capacity;
        this.voltage = voltage;
    }

    public double getCapacity () {
        return capacity;
    }

    public double getVoltage () {
        return voltage;
    }

    public double getEnergy () {
        double energy = 3.6 * capacity * voltage;
        return energy;
    }

    public String toString () {
        String string = Double.toString(getEnergy());
        return string;
    }
}
