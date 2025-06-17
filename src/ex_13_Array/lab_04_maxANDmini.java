package ex_13_Array;

public class lab_04_maxANDmini {
    public static void main(String[] args) {
        int[] marks = {65, 54, 78, 86, 59, 83, 95, 79, 67, 85};

        int output_max = get_max(marks);
        System.out.println("Maximum element: "+output_max);
        int output_mini = get_mini(marks);
        System.out.println("Minimum element: "+output_mini);
    }

    static int get_max(int[] marks){
        int max = marks[0];
        for (int i=0; i<marks.length; i++){
            if (marks[i]>max){
                max = marks[i];
            }
        }
        return max;
    }

    static int get_mini(int[] marks){
        int mini = marks[0];
        for (int i=0; i<marks.length; i++){
            if (marks[i]<mini){
                mini = marks[i];
            }
        }
        return mini;
    }
}