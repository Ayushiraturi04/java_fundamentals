package practice_problem;

import java.util.Scanner;

public class volumeofcylinder {
    public static void main(String[] args) {
        // Volume = π * radius^2 * height.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of radius:");
        int radius = s.nextInt();
        System.out.print("Enter the value of height:");
        int height = s.nextInt();
        float pi = 3.14f;
        System.out.println("volume of cylinder is:" + pi * radius * radius * height);
    }
}
