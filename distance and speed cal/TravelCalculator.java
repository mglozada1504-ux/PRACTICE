public class TravelCalculator{

    public static double calculateDistance(double speed,double time){

        double distance = speed * time;
        return distance;
    }

    public static double calculateSpeed(double distance,double time){

        double speed = distance / time;
        return speed;
    }

    public static double calculateTime(double distance, double speed){

        double time = distance / speed;
        return time;
    }
}