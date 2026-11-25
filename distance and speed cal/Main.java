
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner user = new Scanner(System.in);

        System.out.println("=== TRAVEL CALCULATOR ===");
        System.out.println(" ");
        System.out.println("1. Calculate Distance");
        System.out.println("2. Calculate Speed");
        System.out.println("3. Calculate Time");
        System.out.println(" ");
        
        System.out.print("Enter choice:  ");
        double choice = user.nextDouble();

        if (choice == 1){
            System.out.print("Enter speed (km/h):  ");
            double speed = user.nextDouble();
            System.out.print("Enter hours:  ");
            double time = user.nextDouble();
            double distance = TravelCalculator.calculateDistance(speed,time);
            System.out.println("Distance: " + distance + "km");



        }

        else if(choice == 2){
            System.out.print("Enter distance:  ");
            double distance = user.nextDouble();
            System.out.print("Enter hours:  ");
            double time = user.nextDouble();
            double speed = TravelCalculator.calculateSpeed(distance,time);
            System.out.println("Speed: " + speed + "km/h");

        }

        else if(choice == 3){
            System.out.print("Enter distance:  ");
            double distance = user.nextDouble();
            System.out.print("Enter speed:  ");
            double speed = user.nextDouble();
            double time = TravelCalculator.calculateTime(distance,speed);
            System.out.println("Time: " + time + " hrs");
        }

        else{
            System.out.println("Invalid Choice!! ");
        }
        user.close();


    }
}