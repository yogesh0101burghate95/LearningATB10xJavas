package ex_12_StringFunction;

public class lab_002_ConcatF {
    public static void main(String[] args) {
        String ss = "Hello";  //ss is the reference
        String ss1 = new String(" World"); // new String("Hello"); is the object

        System.out.println(ss.concat(ss1));

    }
}
