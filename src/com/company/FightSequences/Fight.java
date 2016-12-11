package com.company.FightSequences;

import com.company.EnemiesList.*;
import com.company.GenerateStageStandard;
import com.company.Player.plyrStats;

public class Fight {

    public smallSlime_01 [] SmallSlime;
    private String sceneInfo = "";
    public String [] enemyIDs;

    private int [] enemies;
    private int idSum;

    public Fight (int stageNum) {
        GenerateStageStandard stage = new GenerateStageStandard(stageNum);
        int [] enemyInfo = stage.retrieveEnemies();
        sceneInfo = stage.retrieveScenery();
        enemyIDs = stage.retrieveEnemyIDs();
        idSum = stage.idSum();

        if (enemyInfo[0] > 0) {
            SmallSlime = new smallSlime_01[enemyInfo[0]];
        }
    }

    public boolean startFight (plyrStats Player) {
        if (SmallSlime.length == 1) {
            System.out.println("1 Small Slime appeared!");
        } else {
            System.out.println(SmallSlime.length + " Small Slimes appeared!");
        }
        boolean inFight = true;
        boolean winOrLose = false;
        while (inFight) {
            String action = selectChoice.decision();
            int enemyAttacked = -1;
            int abilityUsed = -1;
            int itemUsed = -1;
            boolean defended = false;

            // CHOOSE ACTION
            if (action.equals("attack")) {
                int [] s1HPs = new int [SmallSlime.length]; int [] s1HPCapacities = new int [SmallSlime.length];
                for (int i = 0; i < s1HPs.length; i++) {
                    s1HPs[i] = SmallSlime[i].getHP();
                    s1HPCapacities[i] = SmallSlime[i].getHPCapacity();
                }

                enemyAttacked = attackMenu.chooseEnemy(enemyIDs, idSum, s1HPs, s1HPCapacities);

            } else if (action.equals("abilities")) {
                int [] s1HPs = new int [SmallSlime.length]; int [] s1HPCapacities = new int [SmallSlime.length];
                for (int i = 0; i < s1HPs.length; i++) {
                    s1HPs[i] = SmallSlime[i].getHP();
                    s1HPCapacities[i] = SmallSlime[i].getHPCapacity();
                }

                int [] actionAbilities = abilitiesMenu.chooseAbility(enemyIDs, idSum, s1HPs, s1HPCapacities, Player.getAbilities());
                abilityUsed = actionAbilities[0]; enemyAttacked = actionAbilities[1];

            } else if (action.equals("items")) {

            } else {

            }

            // SPEED EVENT AND ACTIONS

            // WIN OR LOSE CONDITIONS
            if (Player.amtHP <= 0) {
                winOrLose = false;
                break;
            }
        }
            return winOrLose;
        }
    }





}
