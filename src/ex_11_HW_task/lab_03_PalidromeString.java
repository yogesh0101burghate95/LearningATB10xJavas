package ex_11_HW_task;

import java.util.Locale;
import java.util.Scanner;

public class lab_03_PalidromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.next().toLowerCase();
        String reverse = "";

        for (int i= word.length() - 1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        if (reverse.equals(word)){
            System.out.println("Entered word is Palidrome: "+reverse);
        }else {
            System.out.println("Entered word is not Palidrome: "+reverse);
        }
    }
}
