package ex_13_Array;

public class lab_08_reverse_Order {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};
        for (int i=number.length-1 ; i>=0; i--){
            System.out.println(number[i]);
        }
    }
}
