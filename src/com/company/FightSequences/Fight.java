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

    public boolean startFight (plyrStats ps) {
        if (SmallSlime.length == 1) {
            System.out.println("1 Small Slime appeared!");
        } else {
            System.out.println(SmallSlime.length + " Small Slimes appeared!");
        }
        boolean inFight = true;
        while (inFight) {
            String action = selectChoice.decision();
            if (action.equals("attack")) {
                int [] s1HPs = new int [SmallSlime.length]; int [] s1HPCapacities = new int [SmallSlime.length];
                for (int i = 0; i < s1HPs.length; i++) {
                    s1HPs[i] = SmallSlime[i].getHP();
                    s1HPCapacities[i] = SmallSlime[i].getHPCapacity();
                }
                attackMenu.chooseEnemy(enemyIDs, idSum, s1HPs, s1HPCapacities);
            } else if (action.equals("abilities")) {

            } else if (action.equals("items")) {

            } else {

            }

            if (ps.amtHP <= 0) {
                return false;
            }
        }
            return false;
        }
    }





}
