package ex_13_Array;

public class lab_10_2D {
    public static void main(String[] args) {

        int[][] array_2D = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i<array_2D.length;i++){
            for (int j=0;j<array_2D[i].length;j++){

            System.out.print(array_2D[i][j]+"|");
            }
            System.out.println();
        }
    }
}
