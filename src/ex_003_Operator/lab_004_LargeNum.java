package ex_003_Operator;

import java.util.Scanner;

public class lab_004_LargeNum {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = -30;

        int largestNo = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
        System.out.println(largestNo);
    }
}
