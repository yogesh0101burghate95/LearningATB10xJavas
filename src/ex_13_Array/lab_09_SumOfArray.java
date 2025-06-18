package ex_13_Array;

public class lab_09_SumOfArray {

    public static void main(String[] args) {
        int[] numbers = {26, 56, 76, 89};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("Sum of an Array: "+sum);
    }
}
