package com.gmail.prestonhigg17.Battery;

import java.io.InputStream;
import java.util.Scanner;

public class BatteryRun {
    public void run () {
        InputStream input = BatteryRun.class.getResourceAsStream("battery.txt");
        Scanner scan = new Scanner(input);
        BatteryClass battery = new BatteryClass();
        String numberOfBatteries = scan.nextLine();
        int counter = 0;
        while (counter < Integer.parseInt(numberOfBatteries)) {
            String scanForValues = scan.nextLine();
            int space = scanForValues.indexOf(" ");
            double capacity = Double.parseDouble(scanForValues.substring(0,space));
            double voltage = Double.parseDouble(scanForValues.substring(space + 1));
            battery.BatteryClass(capacity, voltage);
            double energy = battery.getEnergy();
            System.out.println("3.6 * " + capacity + " * " + voltage + " = " + energy);
            counter++;
        }
    }

}

