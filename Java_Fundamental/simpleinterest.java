package practice_problem;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value of Principal:");
        int Principal = s.nextInt();
        System.out.print("Enter a value of Rate:");
        int Rate = s.nextInt();
        System.out.print("Enter a value of Time:");
        int Time = s.nextInt();
        float simple_interest = (Principal * Rate * Time) / 100;
        System.out.print("Simple interest is:" + simple_interest);

    }
}
