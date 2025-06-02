package ex_10_userDefinedFunctions;

import java.util.Scanner;

public class lab_009_WithP_WithoutR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        String s= sc.next();
        System.out.println("Enter Book Price: ");
        int i= sc.nextInt();

        bookDetail(s,i);
    }
    static void bookDetail(String name, int price){
        System.out.println("The book name: "+name + "\nBook price: "+price);
    }
}
