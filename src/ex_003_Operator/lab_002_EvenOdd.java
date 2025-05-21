package ex_003_Operator;

import java.util.Scanner;

public class lab_002_EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();

        String evenOrOdd = (num%2 == 0)? "Number is even" : "Number is Odd";
        System.out.println(evenOrOdd);
    }
}
