package ex_13_Array;

public class lab_12_RightTriangle_mirror {
    public static void main(String[] args) {
        int row =5;
        for (int i=row; i>=1; i--){
            for (int j=0; j<i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
