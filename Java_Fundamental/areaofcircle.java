package practice_problem;

import java.util.Scanner;

class areaofcircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value of radius:");
        int radius = s.nextInt();
        float pi = 3.14f;
        System.out.print("Area of  circle:" + pi * radius * radius);

    }

}
// Area=π*radius^2.