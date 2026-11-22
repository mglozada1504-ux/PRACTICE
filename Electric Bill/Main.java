import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner user = new Scanner(System.in);
        
        System.out.println("==== ELECTRICITY BILL ====");
        System.out.print("Enter Name: ");
        String name = user.nextLine();
        System.out.print("Consumption: ");
        int num1 = user.nextInt();
        System. out. println(" ");

        ElectricityBill.displayBill(name,num1);

        




    }
}