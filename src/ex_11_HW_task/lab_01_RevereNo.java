package ex_11_HW_task;

import java.util.Scanner;

public class lab_01_RevereNo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        int reversed = 0;

        while ( number !=0){
            int mod = number%10;
            reversed = reversed * 10 + mod;
            number = number /10;
        }
        System.out.println("Reverse number: "+reversed);
    }
}
