package ex_02_jan;

public class lab_004_UserInput {
    public static void main(String[] args) {

        String company = args[0];

        int em_Id = Integer.parseInt(args[1]);

        double salary = Double.parseDouble(args[2]);

        System.out.println("The Company name is "+ company);
        System.out.println("The employeeID is "+ em_Id);
        System.out.println("The Salary is "+ salary);
    }
}
