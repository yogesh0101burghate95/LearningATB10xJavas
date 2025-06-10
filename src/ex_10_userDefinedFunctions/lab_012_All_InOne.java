package ex_10_userDefinedFunctions;

public class lab_012_All_InOne {
    public static void main(String[] args) {
//        emp();

//        int a = empId();
//        System.out.println("Employee Id is "+a);

//        emp("Rajesh");

        String s = emp_lastName("Butler");
        System.out.println(s);
    }
//    1. Without Parameter without Return type
//    static void emp(){
//        System.out.println("Employee");
//    }

//    2. Without Parameter with Return type
//      static int empId(){
//        return 45;
//      }

//    3. With Parameter without Return type
//    static void emp(String name){
//        System.out.println("Employee name is "+name);
//    }

//    4. With Parameter with Return type
    static String emp_lastName(String lastName){
        return "Employee lastname is "+lastName;
    }
}
