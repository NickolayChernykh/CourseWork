package utils;

import java.text.DecimalFormat;

/**
 * Created by Chernykh on 13.02.2022
 */
public class Rounder {

    public static String round(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(number);
    }
}
