package ex_02_jan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Bill unit = ");
        int unit = sc.nextInt();
        int i = 5;
        int j = 10;
        int k = 20;

        if (unit <=20) {
            System.out.println("Your Bill Amount is " + unit * i);
            }

            else if (unit > 21 && unit <= 40){
            System.out.println("Your Bill Amount is " + unit * j);
            }

            else if(unit > 41){
            System.out.println("Your Bill Amount is " + unit * k);
            }

            else{
            System.out.println("Invalid Input");
            }
    }
}
