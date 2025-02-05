package ex_03_Literal;


public class lab_007_LargestNum {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        int c = 20;

        String result = ((a>b) && (a>c)) ? "A is the Largest Number" :
                (b>a) && (b>c) ? "B is the Largest Number" :
                        (c>a) && (c>b) ? "C is the Largest Number" : "No Result";
        System.out.println(result);
    }
}