package ex_10_userDefinedFunctions;

public class lab_008_All_InOne {
    public static void main(String[] args) {
        // car();

//        String s= car();
//        System.out.println(s);

//        car_detail("Audi", "grey");
        String s= car("Mercedes", 12345678);
        System.out.println(s);
    }
//    1. Withtout Parameter & without ReturnType
//    static void car(){
//        System.out.println("The car name is Audi 320CC");
//    }

//    2. Withtout Parameter & with ReturnType
//    static String car(){
//        return "The car name is Audi 320CC";
//    }

//    3. With Parameter & without ReturnType
//    static void car_detail(String name, String color){
//        System.out.println("The car name is "+ name + " and color is " + color);
//    }

    //    4. With Parameter & with ReturnType
    static String car(String name, long carNo) {
        return "Car name is "+ name + "\nCar number is "+ carNo;
    }

}
