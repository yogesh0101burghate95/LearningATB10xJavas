package ex_13_Array;

public class lab_11_RightTriangle {
    public static void main(String[] args) {
        int row = 5;
        for (int i=0; i<row; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
