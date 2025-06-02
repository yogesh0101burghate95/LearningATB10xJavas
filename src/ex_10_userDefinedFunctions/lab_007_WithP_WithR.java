package ex_10_userDefinedFunctions;

public class lab_007_WithP_WithR {
    public static void main(String[] args) {
       student_detail("Ranjeet", 302, 'B');
    }
    static void student_detail(String name, int rollNo, char section){
        System.out.println("Student name is "+ name + "\nStudent Roll no is "+rollNo + "\nStudent Section is " +section);
    }
}
