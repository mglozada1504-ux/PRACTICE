public class grade{


    public static double calculateAverage(int num1, int num2, int num3){
        double sum = (num1 + num2 + num3) / 3.0;
        return sum;

    }

    public static void getRemarks(double sum){
        if(sum >= 90 && sum <=101){
            System.out.println("Remarks: Excellent");
        }

        else if(sum >= 85){
            System.out.println("Remarks: Very Good");
        }

        else if(sum >= 75){
            System.out.println("Remarks: Passed");
        }

        else if(sum < 75){
            System.out.println("Remarks: Failed");
        }

    }

    public static void displayResult(String name,int num1,int num2, int num3){
        double average = calculateAverage(num1,num2,num3);
        System.out.println("Student: " + name);
        System.out.println("Average: " + average);
        getRemarks(average);
        


        
    }
}