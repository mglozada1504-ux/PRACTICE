public class TemperatureConverter{

    public static double Fahrenheit(double fahrenheit){
        return (fahrenheit - 32) * 5.0/9.0;
    }

    public static double Celcius (double celcius){
        return (celcius * 9.0/5.0) + 32;
    }

    public static void display1(double num){
        double fah = Celcius(num);
        System.out.println("Converted Temperature: " + fah + "°F");
        System.out.println(" ");

    }

    public static void display2(double num){
        double cel = Fahrenheit(num);
        System.out.print("Converted Temperature: " + cel + "°C");
        System.out.println(" ");

    }
}