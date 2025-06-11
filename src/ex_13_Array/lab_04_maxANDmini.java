package ex_13_Array;

public class lab_04_maxANDmini {
    public static void main(String[] args) {
        int[] marks = {65, 54, 78, 86, 59, 83, 95, 79, 67, 85};

        int max_output = give_max(marks);
        System.out.println("The maximum number: "+max_output);
        int mini_output = give_mini(marks);
        System.out.println("The maximum number: "+mini_output);

    }
       static int give_max(int[] marks){
        int max = marks[0];

        for (int i=0; i<marks.length; i++){
            if (marks[i] > max){
                max = marks[i];
            }
        }
           return max;
       }

    static int give_mini(int[] marks){
        int mini = marks[0];

        for (int i=0; i<marks.length; i++){
            if (marks[i] < mini){
                mini = marks[i];
            }
        }
        return mini;
    }
    }

