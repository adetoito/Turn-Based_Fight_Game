package com.company.FightSequences;

import java.util.Scanner;

public class attackMenu {

    public static int chooseEnemy (String [] ei, int sum, int [] s1HPs, int [] s1HPCapacities) {
        Scanner sc = new Scanner(System.in);
        String response;
        int [] id = new int [sum];
        boolean action = true;
        int result = 0;

        while (action) {
            System.out.println("Choose what enemy to attack.");
            System.out.println("Type in its ID number.");
            System.out.println("Type Back to return.\n");
            for (int i = 0; i < sum; i++) {
                if (ei[i].contains("smallSlime")) {
                    System.out.print("(" + (i + 1) + ") Small Slime " + ei[i].substring(ei[i].length() - 1, ei[i].length()) + " // "); // NAME
                    System.out.println(s1HPs[i] + "/" + s1HPCapacities[i] + " HP"); // HP
                }
                id[i] = i;
            }

            response = sc.nextLine();
            if (response.equals("Back")) {
                result = -1;
                action = false;
            } else if (Integer.parseInt(response) < sum) {
                result = Integer.parseInt(response);
                action = false;
            } else {
                System.out.println("Invalid ID number. Please select an ID number.\n");
            }
        }
        return result;
    }

}
