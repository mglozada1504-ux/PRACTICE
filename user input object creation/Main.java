
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner user = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Enter your first name:  ");
        String firstname = user.nextLine();


        System.out.print("Enter your last name:  ");
        String lastname = user.nextLine();


        System.out.print("Enter your middle name:  ");
        char middlename = user.next().charAt(0);
        user.nextLine();


        System.out.print("Enter your age:  ");
        int age = user.nextInt();
        user.nextLine();


        System.out.print("Enter course:  ");
        String course = user.nextLine();


        System.out.print("Enter campus:  ");
        String campus = user.nextLine();





        Family person1 = new Family(firstname,lastname,middlename,age,course, campus);
        









    }



}