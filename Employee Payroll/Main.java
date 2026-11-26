import java.util.Scanner;


public class Main{
    public static void main(String [] args){
        
        
        Scanner user = new Scanner(System.in);

        System.out.print("Enter Employee Name:  ");
        String name = user.nextLine();
        
        System.out.print("Enter Daily Rate: ");
        int rate = user.nextInt();

        System.out.print("Enter Working Days:  ");
        int workingD = user.nextInt();

        System.out.print("Enter Overtime Hours:  ");
        int overtime = user.nextInt();

        PayrollSystem system = new PayrollSystem();

        system.displayPayslip(name,rate,workingD,overtime);








    }
}