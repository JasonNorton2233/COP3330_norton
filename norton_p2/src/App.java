import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    private static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.println(bmi.printBmiCalc());
        System.out.println(bmi.bmiCat());
    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> array) {
        double sum = 0;
        double average = 0;

        for (BodyMassIndex bodyMassIndex : array) {
            sum += bodyMassIndex.bmiCalc();
        }
        average = sum / array.size();
        System.out.println("The average of all BMI scores is: " +average);
    }


    public static double getUserHeight() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your height in inches?");
        double height = input.nextDouble();

        while(height < 0) {
            System.out.println("Please use a positive value for your height.");
            System.out.println();
            System.out.println("What is your height in inches?");
            height = input.nextDouble();
        }

        return height;
    }

    public static double getUserWeight() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is you weight in pounds?");
        double weight = input.nextDouble();

        while(weight < 0) {
            System.out.println("Please use a positive value for your weight.");
            System.out.println();
            System.out.println("What is your weight in pounds?");
            weight = input.nextDouble();
        }

        return weight;
    }

    public static boolean moreInput() {
        boolean contInput = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to enter user info (Y/N)?");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("y")) {
             contInput = true;
        }
        else if (answer.equalsIgnoreCase("n")) {
             contInput = false;
        }

        return contInput;
    }
}
