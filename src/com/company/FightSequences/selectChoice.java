package com.company.FightSequences;

import java.util.Scanner;

public class selectChoice {

    public static String decision () {
        Scanner sc = new Scanner(System.in);
        boolean action = true; boolean num;
        int decision = 0;
        String d = "";
        System.out.println("\nWhat would you like to do?");
        System.out.println("Type in either of the four numbers (actions).");
        System.out.println("---------------------------------------------");
        System.out.println("(1) Attack                      (2) Abilities");
        System.out.println("(3) Defend                          (4) Items");
        while (action) {
            try {
                decision = sc.nextInt();
                num = true;
            } catch (java.util.InputMismatchException ime) {
                System.out.println("Please input a valid number.");
                num = false;
            }
            if (num && decision == 1) {
                d = "attack";
            } else if (num && decision == 2) {
                d = "abilities";
            } else if (num && decision == 3) {
                d = "defend";
            } else if (num && decision == 4) {
                d = "items";
            }
        }
        return d;
    }

}
