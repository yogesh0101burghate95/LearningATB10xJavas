package ex_13_Array;

public class lab_11_LeftTriangle {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){

            for (int space=1;space<=5 -i; space++){
                System.out.print(" ");
            }
            for (int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
