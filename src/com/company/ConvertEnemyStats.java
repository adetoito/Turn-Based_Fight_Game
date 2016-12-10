package com.company;

public class ConvertEnemyStats {

    public static int [] convertHP (String h, String hc) {
        int [] HPStats = {Integer.parseInt(h), Integer.parseInt(hc)};
        return HPStats;
    }

    public static int [] convertEnergy (String e, String ec) {
        int [] EnergyStats = {Integer.parseInt(e), Integer.parseInt(ec)};
        return EnergyStats;
    }

    public static int convertStrength (String s) {
        return Integer.parseInt(s);
    }

    public static int convertDefense (String d) {
        return Integer.parseInt(d);
    }

    public static int convertSpeed (String s) {
        return Integer.parseInt(s);
    }

    public static int convertXPGiven (String x) {
        return Integer.parseInt(x);
    }

    public static int [] convertMoneyValues (String lm, String mm) {
        int [] MoneyStats = {Integer.parseInt(lm), Integer.parseInt(mm)};
        return MoneyStats;
    }

}
