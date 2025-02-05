package ex_03_Literal;
import java.util.Scanner;

public class lab_010_SelfInfo_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("My name is: ");
        String name = sc.next();
        System.out.println("My Surname is: ");
        String surname = sc.next();
        System.out.println("My salary is: ");
        double salary = sc.nextDouble();

        System.out.println("My name is: " +name + "\nMy surname is: " +surname + "\nMy salary is: ");
        sc.close();
    }
}

