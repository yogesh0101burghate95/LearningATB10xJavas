package ex_13_Array;

import java.util.Scanner;

public class lab_06_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i=0; i<numbers.length; i++){
           numbers[i] = sc.nextInt();
        }
        for (int j=0; j<numbers.length; j++) {
            System.out.print(numbers[j]+", ");
        }
    }
}
