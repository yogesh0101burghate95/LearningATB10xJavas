package ex_07_29_jan_hw;
import java.util.Scanner;

public class lab_019_Vote_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter member of Age:- ");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("Member is allowed to vote");
        }
        else {
            System.out.println("Member is not allowed to vote");
            System.out.println("Please wait for " +(18-age) + " years...\nThank you..");
        }
    }
}
