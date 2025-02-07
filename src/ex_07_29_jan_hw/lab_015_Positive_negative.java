package ex_07_29_jan_hw;

import java.util.Scanner;

public class lab_015_Positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Entered number is zero, please enter smaller/greater than 0");
        } else if (number > 0) {
            System.out.println(number + " is positive number");
        } else {
            System.out.println(number + " is negative number");
        }
    }
}
