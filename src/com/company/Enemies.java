package com.company;

// STORES THE INFORMATION OF ALL ENEMIES INTO AN ARRAY.
// ENEMIES' STATS WILL BE CONVERTED AND COMPILED IN THEIR RESPECTIVE CLASSES.

public class Enemies {

    public static String [] smallSlime_01 () {
        String name = "Small Slime";
        String HPCapacity = "20";
        String HP = "20";
        String EnergyCapacity = "0";
        String Energy = "0";
        String Strength = "1";
        String Defense = "0";
        String Speed = "4";

        String expGiven = "2";

        String leastMoneyGiven = "2";
        String mostMoneyGiven = "8";

        String [] data = {name, HPCapacity, HP, EnergyCapacity, Energy, Strength, Defense, Speed, expGiven, leastMoneyGiven, mostMoneyGiven};
        return data;
    }
}
