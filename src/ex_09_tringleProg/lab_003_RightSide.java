package ex_09_tringleProg;

public class lab_003_RightSide {
    public static void main(String[] args) {

        int rows = 5;
        for (int i=1; i<=rows; i++){

            for (int space=1; space<=rows -i; space++){
                System.out.print(" ");
            }

            for (int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
