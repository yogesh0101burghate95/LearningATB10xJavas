package ex_10_userDefinedFunctions;

public class lab_011_allInOne {
    public static void main(String[] args) {
//        animal();

//        String s = animal();
//        System.out.println(s);

//        animal("Dog is barking continue");

        String s = animal("Dog is barking continue");
        System.out.println(s);
    }
//      static void animal(){
//      System.out.println("Dog is barking continue");
//      }

//      static String animal() {
//      return "Dog is barking continue";
//    }

//        static void animal(String shout){
//            System.out.println(shout);
//        }

          static String animal(String shout){
           return shout;
          }
}

