package ex_13_Array;

public class lab_03_forLoop {
    public static void main(String[] args) {
        int[] empId = new int[5];
        empId[0] = 101;
        empId[1] = 201;
        empId[2] = 301;
        empId[3] = 401;
        empId[4] = 501;

        for(int i=0; i<empId.length; i++){
            System.out.println(empId[i]);
        }
    }
}
