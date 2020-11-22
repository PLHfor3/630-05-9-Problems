package com.gmail.prestonhigg17.Dice;

public class DiceClass {
    private int numSides;
    private int lastRoll;
    private int numRoll;

    public DiceClass (int sides) {
        numSides = sides;
        lastRoll = 0;
        numRoll = 0;
    }

    public DiceClass () {
        numSides = 6;
        lastRoll = 0;
        numRoll = 0;
    }



    public void roll () {
        lastRoll = (int) (Math.random() * numSides) + 1;
        numRoll += 1;
    }

    public int getLastRoll () {
        return lastRoll;
    }

    public int getNumRoll () {
        return numRoll;
    }

}
