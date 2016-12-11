package com.company;

import com.company.FightSequences.Fight;
import com.company.Player.plyrStats;

import java.io.IOException;
import java.util.*;

public class Main {

    /*                            *\
    ================================
              TOWER SCOUR
    ================================
    \*                            */

    // GAME LOOP
    public static void main(String[] args) throws IOException {
        plyrStats Player = new plyrStats(20);

        Scanner sc = new Scanner(System.in);
        boolean [] action = new boolean [3];

        // Pre-Game
        System.out.println("Welcome!");
        action[0] = true;
        String gameType = "";

        while (action[0]) {
            System.out.println("Would you like to play a Standard or a Custom game?");
            gameType = sc.nextLine().toLowerCase();
            if (gameType.equals("standard") || gameType.equals("custom")) {
                action[0] = false;
            } else {
                System.out.println("You have chosen an invalid game type. Choose an existing game type.");
            }
        }

        System.out.println("YOU CURRENTLY HAVE " + Player.researchPoints + " RESEARCH POINTS.");
        System.out.println("\nResearch Points are points that you can invest into your five main stats to");
        System.out.println("improve them!\n");

        action[0] = true;

        int [] primaryStats = Player.returnPrimaryStats();
        int [] secondaryStats = Player.returnSecondaryStats();

        while (action[0]) {
            System.out.println("Would you like to use your points to increase stats? (RECOMMENDED)");
            String investPoints = sc.nextLine();
            if (investPoints.equalsIgnoreCase("yes")) {
                String statToInvest = "";
                action[1] = true;

                while (action[1]) {
                    action[2] = true;
                    while (action[2]) {
                        System.out.println("What stat would you like you invest your points into?");
                        System.out.println("\nStats:\n* HP: " + primaryStats[0] + "\n* Energy: " + primaryStats[1]);
                        System.out.println("* Strength: " + primaryStats[2] + "\n* Defense: " + primaryStats[3]);
                        System.out.println("* Speed: " + primaryStats[4] + "\nLuck: " + primaryStats[5]);

                        statToInvest = sc.nextLine().toLowerCase();

                        if (statToInvest.equals("hp") || statToInvest.equals("energy") || statToInvest.equals("defense") || statToInvest.equals("speed") || statToInvest.equals("luck") || statToInvest.equals("strength")) {
                            action[2] = false;
                        } else {
                            System.out.println("Invalid stat. Please input an existing stat.");
                        }
                    }
                    action[2] = true;
                    while (action[2]) {
                        System.out.println("How many points would you like to invest into this stat?");
                        boolean num = true;
                        int amtToUse = 0;
                        try {
                            amtToUse = sc.nextInt();
                        } catch (java.util.InputMismatchException ime) {
                            System.out.println("Please input a number.");
                            num = false;
                        }
                        if (num) {
                            Player.investPoints(amtToUse, statToInvest);
                            action[2] = false;
                        }
                    }
                    action[2] = true;
                    int inLoop = 0;
                    do {
                        String decision = sc.nextLine().toLowerCase();

                        if (decision.equals("yes")) {
                            action[2] = false;
                            break;
                        } else if (decision.equals("no")) {
                            action[2] = false; action[1] = false;
                        } else {
                            if (inLoop > 0) {
                                System.out.println("Invalid answer. Please input a valid answer.");
                            }
                        }
                        inLoop++;
                        System.out.println("Would you like to select another stat to invest points into?");
                    } while (action[2]);
                    if (!action[1]) {
                        break;
                    }
                    System.out.println("You now have " + Player.researchPoints + " Research Points.\n");
                }
            } else if (investPoints.equalsIgnoreCase("no")) {
                action[0] = false;
            } else {
                System.out.println("Invalid answer. Please type in Yes or No.");
            }
        }
        // Begin Game
        int [] dynamicStats = Player.returnDynamicStats();
        int HP = dynamicStats[0];
        int Energy = dynamicStats[1];

        boolean gameLoop = true;
        int stageNum = 1;

        while (gameLoop) {
            if (gameType.equals("standard")) {
                Fight fight = new Fight(stageNum);
                boolean winOrLose = fight.startFight(Player);

            } else {
                GenerateStageRandom stage = new GenerateStageRandom(stageNum);
            }
        }

    }

}
