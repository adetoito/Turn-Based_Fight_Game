package com.company.FightSequences;

import java.util.Scanner;
import com.company.Player.*;

public class abilitiesMenu {

    public static int [] chooseAbility (String [] ei, int sum, int [] s1HPs, int [] s1HPCapacities, String [] plyrAbilities) {
        int [] choices = new int [2];

        Scanner sc = new Scanner(System.in);
        String response;
        boolean action = true;

        while (action) {
            System.out.println("Choose what ability to use.");
            System.out.println("Type in its ID number.");
            System.out.println("Type Back to return.\n");
            plyrStats.displayAbilities();
        }

        if ()

        choices[1] = attackMenu.chooseEnemy(ei, sum, s1HPs, s1HPCapacities);
    }

}
