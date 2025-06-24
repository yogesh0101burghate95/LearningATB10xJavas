package ex_14_Oops;

public class Constructor {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.name = "Husky";
        System.out.println("Dog name: "+d1.name);
        d1.color = "Grey";
        System.out.println("Dog color: "+d1.color);
        System.out.println("--------------------------");

        dog d2 = new dog();
        d2.name = "Bulldog";
        System.out.println("Dog name: "+d2.name);
        d2.color = "Black";
        System.out.println("Dog color: "+d2.color);
    }
}

class dog{
    String name;
    String color;

    dog(){
        System.out.println("Dog Info");
    }
}


