package ex_Count_vowels;
import  java.util.Scanner;

public class lab_013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word Here: ");
        String word = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        word = word.toLowerCase();

        for (int i=0; i< word.length(); i++ )
        {
            char letter = word.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            {
                vowels = vowels + 1;
            }
            else if (letter >= 'a' && letter <= 'z'){
                consonants = consonants + 1;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
