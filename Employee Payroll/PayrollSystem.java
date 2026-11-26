public class PayrollSystem{

    public static double calculateBasicSalary( double rate, double workingD){
        double total = rate * workingD;
        return total;


    }

    public static double calculateOvertimePay(double rate, double overtime){
        double hourlyrate = rate / 8.0;
        double overtimerate = 1.25 * hourlyrate;
        double sum = overtimerate * overtime;
        return sum;
        
       

    }

    public static double calculateGrossSalary(double total,double sum ){
        double gross = total + sum;
        return gross;


    }

    public static double calculateNetSalary(double gross){
        double salary = gross - 500;
        return salary;



    }

    public static void displayPayslip(String name,double rate, double workingD,double overtime){

        double basicSalary = calculateBasicSalary(rate,workingD);

        double overtimePay = calculateOvertimePay(rate,overtime);

        double grossSalary = calculateGrossSalary(basicSalary,overtimePay);

        double netSalary = calculateNetSalary(grossSalary);


        System.out.println(" ");


        System.out.println("Basic Salary: ₱ " + basicSalary);

        System.out.println("Overtime Pays: ₱" + overtimePay);

        System.out.println("Gross Salary: ₱"+ grossSalary);

        System.out.println("Deductions: ₱500");

        System.out.println(" ");

        System.out.println("Net Salary: ₱" + netSalary);



    }
}