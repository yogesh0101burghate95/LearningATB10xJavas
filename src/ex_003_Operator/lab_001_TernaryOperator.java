package ex_003_Operator;

import java.util.Scanner;

public class lab_001_TernaryOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks = ");
        int marks = sc.nextInt();

        String grade = (marks >=90 && marks <=100)? "A" :
                       (marks >=80) ? "B":
                       (marks >=70) ? "C":
                       (marks >=60) ? "D":
                       (marks <=59) ? "F" : "Invalid Input";

        System.out.println(grade);
    }
}
