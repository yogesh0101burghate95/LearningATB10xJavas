package ex_03_Literal;
import java.util.Scanner;

public class lab_008_LargestNum_scanner {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        System.out.println("Enter number c: ");
        int c = sc.nextInt();


        String result = ((a>b) && (a>c)) ? "A is the Largest Number" :
                (b>a) && (b>c) ? "B is the Largest Number" :
                        (c>a) && (c>b) ? "C is the Largest Number" : "No Result";

        System.out.println(result);
        sc.close();
    }
}
