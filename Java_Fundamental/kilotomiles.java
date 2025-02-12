package practice_problem;

import java.util.Scanner;

class kilotomiles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of kilometer:");
        int kilometer = s.nextInt();
        float Miles = (kilometer * 0.621371f);
        System.out.print("In Miles:" + Miles);
    }
}
// Miles=Kilometers*0.621371.