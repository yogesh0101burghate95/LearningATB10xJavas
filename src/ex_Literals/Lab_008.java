package ex_Literals;
import java.util.Scanner;

public class Lab_008 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int check = 1;

          System.out.println("Welcome!!!");
        while (check == 1) {
            System.out.print("\nEnter Number (0-100) =");
            int marks = sc.nextInt();

            // Grade = condition ? expression_1 : expression_2
            String result = ((marks >= 90 && marks <= 100) ? "A" :
                    (marks >= 80 && marks <= 89) ? "B" :
                            (marks >= 70 && marks <= 79) ? "C" :
                                    (marks >= 60 && marks <= 69) ? "D" :
                                            (marks >= 1 && marks > 59) ? "F" : "Failed");
            System.out.println(result);
            System.out.print("\nDo you want to continue? (1-Yes, 0-No): ");
            check = sc.nextInt();
        }
        System.out.println("Thank you for using Grade Calculator!");
        sc.close();
    }
}
