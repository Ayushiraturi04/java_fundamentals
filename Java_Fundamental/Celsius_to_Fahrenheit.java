package practice_problem;

import java.util.*;

public class Celsius_to_Fahrenheit {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of celsius:");
        int C = s.nextInt();
        float F = (C * 9 / 8) + 32;
        System.out.print("Fahrenhite:" + F);
    }
}
// Fahrenheit = (Celsius * 9/5) + 32.