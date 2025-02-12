package practice_problem;

import java.util.*;

public class averageofthreenumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = s.nextInt();
        System.out.print("Enter value of b:");
        int b = s.nextInt();
        System.out.print("Enter value of c:");
        int c = s.nextInt();
        System.out.print("Average:" + (a + b + c) / 3);
    }
}
