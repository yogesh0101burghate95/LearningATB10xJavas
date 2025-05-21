package ex_02_jan;

import java.util.Scanner;

public class lab_003_TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();

        String evenOrOdd = (num%2 == 0)? "Number is even" : "Number is Odd";
        System.out.println(evenOrOdd);
    }
}
