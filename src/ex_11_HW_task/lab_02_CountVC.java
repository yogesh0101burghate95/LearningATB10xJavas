package ex_11_HW_task;

import java.util.Locale;
import java.util.Scanner;

public class lab_02_CountVC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = sc.next().toLowerCase();
        int vowels= 0;
        int consonants= 0;

        for (int i =0; i<word.length(); i++){
            char ch = word.charAt(i);

            if (Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels count: "+vowels);
        System.out.println("Consonants count: "+consonants);
    }
}
