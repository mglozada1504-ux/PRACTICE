import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        System.out.println(" ");

        System.out.println("===CALCULATOR==");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" Do you want to use? ");
        System.out.print("YES OR NO:   ");
        String account = user.nextLine();

        if(account.equalsIgnoreCase("YES")){

            while(true){
            System.out.print("Enter First number:  ");
            double num1 = user.nextDouble();
            System.out.print("Enter Second number:  ");
            double num2 = user.nextDouble();

            System.out.println("--CHOOSE OPERATOR--");

            System.out.println("1. ADDITION ");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. EXIT");
            System.out.print("PICKED OPERATOR:  ");
            int operator = user. nextInt();

            if(operator == 1){
                double total = operators.addition(num1,num2);
                System.out.println(total);
            }

            else if(operator == 2){
                double total = operators.subtraction(num1,num2);
                System.out.println(total);
            }

            else if(operator == 3){
                double total = operators.multiplication(num1,num2);
                System.out.println(total);
            }

            else if(operator == 4){
                double total = operators.division(num1,num2);
                System.out.println(total);
            }

            else if(operator == 5){
                System.out.println("Thank you, SYSTEM EXIT!! ");
                break;

            }
            }
        }
        else{
            user.close();
            System.out.println("Thank you, SYSTEM EXIT!! ");
        }

    }
}