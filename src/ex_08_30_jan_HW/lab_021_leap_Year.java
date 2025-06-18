package ex_08_30_jan_HW;
import java.util.Scanner;

public class lab_021_leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("Entered Year is a leap year");
        }else {
            System.out.println("Entered Year is not a leap year");
        }
    }
}
