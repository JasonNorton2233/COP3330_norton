import java.lang.Math;

public class BodyMassIndex {
    double height;
    double weight;

    public BodyMassIndex(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double bmiCalc() {
        double bmi = 0;

        bmi = 703 * (weight/Math.pow(height, 2));

        return bmi;
    }

    public String printBmiCalc() {
        return "Your BMI score is: " + bmiCalc();
    }

    public String bmiCat() {
        double bmi;
        String category;
        bmi = bmiCalc();

        if(bmi < 18.5) {
            category = "Your BMI category is: Underweight";
            return category;
        }
        else if(bmi >= 18.5 && bmi <= 24.9) {
            category = "Your BMI category is: Normal weight";
            return category;
        }
        else if(bmi >= 25 && bmi <= 29.9) {
            category = "Your BMI category is: Overweight";
            return category;
        }
        else {
            category = "Your BMI category is: Obesity";
            return category;
        }
    }
}
