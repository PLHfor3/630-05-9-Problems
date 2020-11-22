package com.gmail.prestonhigg17.Dice;

public class DiceRun {
    public void runA() {
        DiceClass d1 = new DiceClass();
        DiceClass d2 = new DiceClass();
        for (int roll = 0; roll <= 10; roll++) {
            d1.roll();
            d2.roll();
            System.out.print("Dice Roll D1: " + d1.getLastRoll() + "    Dice Roll D2: " + d2.getLastRoll());
            if (d1.getLastRoll() + d2.getLastRoll() == 2) {
                System.out.println(" Snake Eyes");
            } else if (d1.getLastRoll() + d2.getLastRoll() == 7) {
                System.out.println(" Lucky Seven");
            } else if (d1.getLastRoll() + d2.getLastRoll() == 12) {
                System.out.println(" Box Cars");
            } else {
                System.out.println("");
            }
        }
    }
    public void runB () {
        DiceClass d08 = new DiceClass(8);
        DiceClass d12 = new DiceClass(12);
        while ((d08.getLastRoll() + d12.getLastRoll()) != 10) {
            d08.roll();
            d12.roll();
            System.out.println("Roll #" + d08.getNumRoll() + "    8 Sided Dice: " + d08.getLastRoll() + "    12 Sided Dice: " + d12.getLastRoll());
        }
        System.out.println("\nTotal Number Of Rolls: " + d08.getNumRoll());
    }

    public void runC () {
        DiceClass three = new DiceClass(3);
        double ones = 0, twos = 0, threes = 0;
        while (three.getNumRoll() <= 10000) {
            three.roll();
            if (three.getLastRoll() == 1) {
                ones++;
            } else if (three.getLastRoll() == 2) {
                twos++;
            } else if (three.getLastRoll() == 3) {
                threes++;
            }
        }
        System.out.println("Total Number of Ones Rolled: " + (int) ones + "    Percent of Rolls: " + percentage(ones,10000));
        System.out.println("Total Number of Twos Rolled: " + (int) twos + "    Percent of Rolls: " + percentage(twos,10000));
        System.out.println("Total Number of Threes Rolled: " + (int) threes + "    Percent of Rolls: " + percentage(threes,10000));
    }
    private String percentage (double numerator, double denominator) {
        double percent = ((numerator / denominator) * 100);
        String percentString = (String.format("%.1f", percent));
        return percentString;
    }

}
