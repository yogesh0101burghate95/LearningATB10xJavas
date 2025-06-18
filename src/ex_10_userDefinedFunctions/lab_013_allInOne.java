package ex_10_userDefinedFunctions;

public class lab_013_allInOne {
    public static void main(String[] args) {
//        bike_name();

//        String s = bike_name();
//        System.out.println(s);

//        bike_name("Hero");

        String s = bike_name("Hero");
        System.out.println(s);

    }
//    static void bike_name(){
//        System.out.println("Hero");
//        }

//    static String bike_name() {
//        return "Hero";
//    }

//    static void bike_name(String name){
//        System.out.println(name);
//    }

    static String bike_name(String name){
        return name;
    }
}