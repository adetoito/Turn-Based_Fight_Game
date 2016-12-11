package com.company.Player;

// COMPILES ALL STATS OF THE PLAYER.

public class plyrStats {

    public plyrStats (int i) {
        researchPoints = i;
    }

    //
    //
    // INVESTING STATS
    //
    //

    public int researchPoints;

    public int HPCapacity = 100;
    public int EnergyCapacity = 20;
    public int Strength = 3;
    public int Defense = 0;
    public int Speed = 10;
    public int Luck = 0;

    public int amtHP;
    public int amtEnergy;

    private int pseudoDefensiveCounter = 0;
    private int pseudoSpeedCounter = 0;
    private int pseudoStrengthCounter = 0;

    public int [] returnPrimaryStats () {
        int [] stats = {HPCapacity, EnergyCapacity, Strength, Defense, Speed, Luck};
        return stats;
    }
    public int [] returnSecondaryStats () {
        int [] stats = {Level, Money};
        return stats;
    }

    public int [] returnDynamicStats () {
        int [] stats = {amtHP, amtEnergy};
        return stats;
    }

    public void investPoints (int pts, String stat) {
        researchPoints -= pts;
        if (stat.equals("hp")) {
            HPCapacity += pts * 2;
        } else if (stat.equals("energy")) {
            EnergyCapacity += pts;
        } else if (stat.equals("defense")) {
            pseudoDefensiveCounter += pts;
            while (!(pseudoDefensiveCounter <= 2)) {
                if (pseudoDefensiveCounter >= 2) {
                    pseudoDefensiveCounter -= 2;
                    Defense += 1;
                }
            }
        } else if (stat.equals("speed")) {
            pseudoSpeedCounter += pts;
            while (!(pseudoSpeedCounter <= 2)) {
                if (pseudoSpeedCounter >= 2) {
                    pseudoSpeedCounter -= 2;
                    Speed += 1;
                }
            }
        } else if (stat.equals("luck")) {
            Luck += pts;
        } else if (stat.equals("strength")) {
            pseudoStrengthCounter += pts;
            while (!(pseudoStrengthCounter <= 2)) {
                if (pseudoStrengthCounter >= 2) {
                    pseudoStrengthCounter -= 2;
                    Strength += 1;
                }
            }
        }
    }

    //
    //
    // MONEY
    //
    //

    public int Money;

    public void addMoney (int m) {
        Money += m;
    }

    public void subtractMoney (int m) {
        Money -= m;
    }

    public int Level = 1;

    //
    //
    // ABILITIES
    //
    //

    public String [] abilities = {"Research"};
    public int [] energyUsage = {1};

    public boolean ableToUseAbility (int a) {
        boolean b = true;
        if (Level >= 1) {
            abilities[0] = "Research";
            energyUsage[0] = 1;
        } else if (Level >= 4) {
            abilities[1];
        } else if (Level >= 9) {
            abilities[2];
        } else if (Level >= 17) {
            abilities[3];
        } else if (Level >= 26) {
            abilities[4];
        } else if (Level >= 38) {
            abilities[5];
        } else if (Level >= 49) {
            abilities[6];
        } else if (Level >= 62) {
            abilities[7];
        } else {
            b = false;
        }
        return b;
    }

    public String [] getAbilities () {
        if (Level >= 1) {
            String [] plyrAbilities = {abilities[0]};
            return plyrAbilities;
        } else if (Level >= 4) {

        } else if (Level >= 9) {

        } else if (Level >= 17) {

        } else if (Level >= 26) {

        } else if (Level >= 38) {

        } else if (Level >= 49) {

        } else if (Level >= 62) {

        }
    }

    public void displayAbilities () {
        String [] plyrAbilities = getAbilities();
        for (int i = 0; i < plyrAbilities.length; i++) {
            System.out.println("(" + (i + 1) + ") " + plyrAbilities[i]);
        }
    }

    //
    //
    // IN-FIGHT METHODS
    //
    //

    public int loseHP (int lostHP) {
        amtHP -= lostHP;
        return amtHP;
    }

    public void levelUp (int l) {
        Level += 1;
    }

}
