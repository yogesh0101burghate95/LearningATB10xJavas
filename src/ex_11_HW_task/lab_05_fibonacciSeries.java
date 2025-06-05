package ex_11_HW_task;

import java.util.Scanner;

public class lab_05_fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        int firstNo = 0;
        int secondNo = 1;

        for (int i=0; i<=n; i++){
            int next = i;
            firstNo = secondNo;
            secondNo = next;
        }
    }
}
