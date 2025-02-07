package ex_07_29_jan_hw;
import java.util.Scanner;

public class lab_016_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int number = sc.nextInt();

 //       for(int i=1; i<=100; i++) {
            if (number%2 == 0)
            {
                System.out.println(number +" is even number");
            }
            else{
                System.out.println(number +" is odd number");
            }

    }
}
