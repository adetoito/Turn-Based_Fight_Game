package com.company;

public class GenerateStageStandard {

    /*
    ENEMIES:
    0 - Small Slime - Introduced STAGE 1
    1 - Snake (can poison the player) - Introduced STAGE 4
    2 - Bat - Introduced STAGE 7
    3 - Medium Slime (splits into two small slimes) - Introduced STAGE 13
    4 - Provoker (low HP, but has to be taken out before attacking other enemies) - Introduced STAGE 18
    5 - Corrupter (can curse or blind the player) - Introduced STAGE 22
    6 - Cannon - Introduced STAGE 27
    7 - Healer (heals other enemies) - Introduced STAGE 33
    8 - Provoker - Introduced STAGE 38
    9 - Large Slime (splits into two medium slimes) - Introduced STAGE 45
    10 - Sorcerer (hybrid healer & basic enemy) - Introduced STAGE 50
    11 - Witch (buffs other enemies) - Introduced STAGE 56
    12 - Tanker - Introduced STAGE 63
    13 - Boomer (takes 3 turns to attack with high power) - Introduced STAGE 72
    14 - Laser Blaster - Introduced STAGE 79
    15 - Guardian - Introduced STAGE 91

    BOSSES:
    Stage 20:
    Stage 40: Ninja
    Stage 60: King Slime (splits into two large slimes)
    Stage 80: Necromancer
    Final Boss: Derek Lee the Overlord
     */

    public int stageNumber;

    public GenerateStageStandard (int s) {
        stageNumber = s;
    }

    public String retrieveScenery () {
        String s = "";
        return s;
    }

    public int sumOfAllEnemies;

    public int [] retrieveEnemies () {
        int [] enemies = new int [15];
        if (stageNumber == 1) {
            enemies[0] = 2;
        }
        return enemies;
    }

    public String [] retrieveEnemyIDs () { // USED FOR ATTACKING AND ABILITIES
        int sum = 0;
        int [] allEnemies = retrieveEnemies();
        for (int i = 0; i < allEnemies.length; i++) {
            sum += allEnemies[i];
        }
        String [] enemyIDs = new String [sum];
        int counter = 0;
        for (int i = 0; i < sum; i++) {
            if (allEnemies[0] > 0) {
                for (int smallSlime = 0; smallSlime < allEnemies[0]; smallSlime++) {
                    enemyIDs[counter] = "smallSlime" + counter;
                }
            }
        }
        sumOfAllEnemies = sum;
        return enemyIDs;
    }

    public int idSum () {
        return sumOfAllEnemies;
    }

}
