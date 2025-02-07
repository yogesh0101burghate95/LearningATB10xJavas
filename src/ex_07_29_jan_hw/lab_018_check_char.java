package ex_07_29_jan_hw;
import java.util.Scanner;

public class lab_018_check_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:-");
        char alphabet = sc.next().charAt(0);

        alphabet = Character.toLowerCase(alphabet);

        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
        {
            System.out.println("Alphabet is vowel");
        }
        else {
            System.out.println("Alphabet is consonant");
        }
    }

    }

