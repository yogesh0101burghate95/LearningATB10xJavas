package ex_14_Oops;

public class car {
    public static void main(String[] args) {
        Info i = new Info();
        i.identify();

       }
    }
    class Info{
        String car_name;
        int car_num;

       void identify() {
            car_name = "Bolero";
            car_num = 3444;
           System.out.println(car_name);
           System.out.println(car_num);
        }
    }

