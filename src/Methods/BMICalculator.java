package Methods;

import java.util.Scanner;

public class BMICalculator {
    static void printIntroduction(){
        System.out.println("BMI calculator calculates you index by a formula.");
    }

    static double bmiFor(double weight, double height){
        return weight * 703 / (height * height);
    }

    static String getStatus(double BMI){
        if(BMI < 18.5){
            return "Underweight";
        } else if(BMI < 25){
            return "Normal";
        } else if(BMI < 30){
            return "Overweight";
        }else {
            return "Obese";
        }
    }

    static String reportResult(int a, double BMI, String status){
        return "You are number " + a + " with BMI = " + Math.round(BMI)  + " status: " + status;
    }

    static double getBMI(Scanner sc){
        System.out.println("Input your height in cm : ");
        double cmHeight = sc.nextDouble();
        double inchHeight = cmHeight * 0.3937;

        System.out.println("Input your weight in kg : ");
        double kgWeight = sc.nextDouble();
        double lbsWeight = kgWeight * 2.2046;

        return bmiFor(lbsWeight, inchHeight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printIntroduction();
        double BMI = getBMI(sc);
        String result = reportResult(1, BMI, getStatus(BMI));
        System.out.println(result);

    }
}
