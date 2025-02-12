package practice_problem;

import java.util.Scanner;

public class perimeterofrectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value of length:");
        int length = s.nextInt();
        System.out.print("Enter a value of breadth:");
        int breadth = s.nextInt();
        System.out.println("Perimeter is:" + 2 * length * breadth);
    }
}
