package ex_08_30_jan_HW;
import  java.util.Scanner;

public class lab_020_largestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:- ");
        int a = sc.nextInt();
        System.out.println("Enter b num:- ");
        int b = sc.nextInt();
        System.out.println("Enter c num:- ");
        int c = sc.nextInt();

        String result = ((a>b) && (a>c) ? "Num A is greater" : (b>a) && (b>c) ?
                "Num B is greater" : (c>a) && (c>b) ? "Num C is greater" : "No result");
        System.out.println(result);
        }
    }

