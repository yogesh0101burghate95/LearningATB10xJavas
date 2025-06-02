package ex_09_tringleProg;

public class lab_004_RightSideOppo {
    public static void main(String[] args) {
        int rows = 5; // total number of lines

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 0; star <= rows - i; star++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

}
