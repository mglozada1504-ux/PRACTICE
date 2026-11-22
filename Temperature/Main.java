import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner user = new Scanner(System.in);
        


        while(true){
            System.out.println("====TEMPERATURE CONVERTER====");
            System.out.println(" ");
            System.out.println("1. Celcius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celcius");
            System.out.println("3. EXIT");
            System.out.println(" ");
            System.out.print("Enter choice:  ");
            int choice = user.nextInt();
            System.out.println(" ");



            if (choice == 1){
                System.out.print("Enter Celcius: ");
                int num1 = user.nextInt();
                TemperatureConverter.display1(num1);
            }

            else if(choice == 2){
                System.out.print("Enter Fahrenheit: ");
                int num2 = user.nextInt();
                TemperatureConverter.display2(num2);
            }

            else if(choice == 3){
                System.out.println("Thank you, System Exit!! ");
                break;
            }

            else{
                System.out.println("Invalid Choices!! ");
                System.out.println(" ");
            }


        }
        user.close();



    }
}