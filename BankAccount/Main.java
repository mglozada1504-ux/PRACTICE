
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        

        Scanner user = new Scanner(System.in);

        System.out.println("==== BANKING SYSTEM ====");
        System.out.print("Do you want to enter? :   ");
        System.out.println("YES OR NO");
        String access = user.nextLine();

        if(access.equalsIgnoreCase("Yes")){
            System.out.print("Enter your Name: ");
            String name = user.nextLine();

            BankAccount account = new BankAccount(name);
            System.out.println("WELCOME, " + name +"!");
            account.display();

            while(true){
                System.out.println("---MENU----");
                System.out.println("1.Display Balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Exit");

                int choice = user.nextInt();

                if(choice == 1){
                    account.display();
                }
                else if(choice == 2){
                    System.out.print("Enter amount to deposit:  ");
                    double amt = user.nextDouble();
                    account.deposit(amt);
                }
                else if(choice == 3){
                    System.out.print("Enter amount to withdraw:  ");
                    double amt = user.nextDouble();
                    account.withdraw(amt);
                }
                else if(choice == 4){
                    System.out.println("Thank you!! ");
                    break;
                }
            }

        }
        else{
            System.out.print("Thank you, Exiting System!!");

        }
        user.close();
    }
}