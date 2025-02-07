package ex_Palidrome;
import java.util.Scanner;

public class lab_014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word:- ");
        String user = sc.nextLine();
        user = user.toLowerCase();
        String reverse = "";

        for (int i = user.length() - 1; i >= 0; i--)
        reverse = reverse + user.charAt(i);
        {
            if (user.toString().equals(user)) {
                System.out.println("Word is a Palindrome:- " + reverse);
            }
            else {
                System.out.println("Word is not a Palindrome:- "+ reverse);
        }
        }
    }
}
