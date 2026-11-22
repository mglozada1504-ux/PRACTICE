public class ElectricityBill{

    public static int calculateBill(int bill){
        if(bill >200){
            int sum = bill * 10;
            return sum;
        }

        else if(bill >= 101){
            int sum = bill * 7;
            return sum;
        }

        else if(bill >= 1){
            int sum = bill * 5;
            return sum;
        }
        return 0;


    }

    public static void getConsumptionCategory(int bill){
        if(bill > 200){
            System.out.println("Category: High Consumption");
            System.out.println("Rate: ₱10.00");
        }

        else if(bill >= 101){
            System.out.println("Category: Medium Consumption");
            System.out.println("Rate: ₱7.00");
        }

        else if(bill >= 1){
            System.out.println("Category: Low Consumption");
            System.out.println("rate: ₱5.00");
        }
    }


    public static void displayBill(String name,int num1){

        int total = calculateBill(num1);
        


        System.out.println("Costumer Name: " + name);
        System.out.println("Consumption: " + num1 + "kWh");
        System.out.println(" ");
        getConsumptionCategory(num1);
        System.out.println(" ");
        System.out.println("Total bill: ₱" + total);
    }

}
