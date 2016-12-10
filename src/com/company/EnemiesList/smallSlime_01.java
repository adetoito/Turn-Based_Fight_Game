package com.company.EnemiesList;

import com.company.ConvertEnemyStats;
import com.company.Enemies;

// CREATES ONE ENEMY OF THIS VARIETY
// METHODS INVOLVING STRATEGIES WILL BE LAID OUT HERE EVENTUALLY.

public class smallSlime_01 {

    public String enemyName;
    public int HPCapacity;
    public int startHP;
    public int EnergyCapacity;
    public int startEnergy;
    public int Strength;
    public int Defense;
    public int Speed;
    public int XPGiven;
    public int lowestMoneyGiven;
    public int highestMoneyGiven;

    public smallSlime_01 () {
        String [] data = Enemies.smallSlime_01();
        int [] HPS = ConvertEnemyStats.convertHP(data[1], data[2]);
        int [] EnergyS = ConvertEnemyStats.convertEnergy(data[3], data[4]);
        int [] rndmMoney = ConvertEnemyStats.convertMoneyValues(data[9], data[10]);

        enemyName = data[0];

        HPCapacity = HPS[0];
        startHP = HPS[1];

        EnergyCapacity = EnergyS[0];
        startEnergy = EnergyS[1];

        Strength = ConvertEnemyStats.convertStrength(data[5]);
        Defense = ConvertEnemyStats.convertDefense(data[6]);
        Speed = ConvertEnemyStats.convertSpeed(data[7]);
        XPGiven = ConvertEnemyStats.convertXPGiven(data[8]);

        lowestMoneyGiven = rndmMoney[0];
        highestMoneyGiven = rndmMoney[1];
    }

    public int getHP () {
        return startHP;
    }

    public int getHPCapacity () {
        return HPCapacity;
    }

}
