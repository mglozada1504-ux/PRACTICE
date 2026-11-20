
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);


        System.out.print("Enter student name:  ");
        String name = user.nextLine();




        System.out.print("Enter Math Grade:  ");
        int num1 = user.nextInt();

        System.out.print("Enter English Grade:  ");
        int num2 = user.nextInt();

        System.out.print("Enter Science Grade:  ");
        int num3 = user.nextInt();

        grade.displayResult(name, num1, num2, num3);

        user.close();


    }
}