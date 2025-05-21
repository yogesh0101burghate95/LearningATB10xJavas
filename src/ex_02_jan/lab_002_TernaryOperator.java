package ex_02_jan;

import java.util.Scanner;

public class lab_002_TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age = ");
        int age = sc.nextInt();

        String eligibleOrNot = (age >=18) ? "Your are Eligible" : "Your are not Eligible";
        System.out.println(eligibleOrNot);
         if (age <18){
             System.out.println("Your are eligible for vote after = "+ (18-age) + " year/s");
         }
    }
}
