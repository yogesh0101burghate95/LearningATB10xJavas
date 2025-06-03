package ex_10_userDefinedFunctions;

import java.util.Scanner;

public class lab_010_taskMisc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int y = sc.nextInt();
        if (y==0){
            System.out.println("Invalid Input");
            sc.close();
        }

        System.out.println("Enter 2nd number: ");
        int z = sc.nextInt();
        if (z==0) {
            System.out.println("Invalid Input");
            sc.close();
        }
        sum(y,z);
        sub(y,z);
        mul(y,z);
        div(y,z);
        mod(y,z);

        System.out.println("Sum of the 2 number: "+sum(y,z));
        System.out.println("Sub of the 2 number: "+sub(y,z));
        System.out.println("Multiplication of the 2 number: "+mul(y,z));
        System.out.println("Division of the 2 number: "+div(y,z));
        System.out.println("Modulus of the 2 number: "+mod(y,z));

    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b){
        return a/b;
    }

    static int mod(int a, int b){
        return a%b;
    }
}
