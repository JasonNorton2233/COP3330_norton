import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {

    @Test
    void bmiCalcTest() {
        BodyMassIndex e = new BodyMassIndex(68,200);
        assertEquals(30.406574394463664, e.bmiCalc());
    }

    @Test
    void printBmiCalcTest() throws FileNotFoundException {
        BodyMassIndex e = new BodyMassIndex(72,190);
        System.setOut(new PrintStream(String.valueOf(e)));

        assertEquals("Your BMI score is: 25.76581790123457", e.printBmiCalc());
    }

    @Test
    void bmiCatTestUnderweight() throws FileNotFoundException{
        BodyMassIndex e = new BodyMassIndex(65,110);
        System.setOut(new PrintStream(String.valueOf(e)));

        assertEquals("Your BMI category is: Underweight", e.bmiCat());
    }

    @Test
    void bmiCatTestNormalWeight() throws FileNotFoundException{
        BodyMassIndex e = new BodyMassIndex(71,140);
        System.setOut(new PrintStream(String.valueOf(e)));

        assertEquals("Your BMI category is: Normal weight", e.bmiCat());
    }

    @Test
    void bmiCatTestOverweight() throws FileNotFoundException{
        BodyMassIndex e = new BodyMassIndex(76,210);
        System.setOut(new PrintStream(String.valueOf(e)));

        assertEquals("Your BMI category is: Overweight", e.bmiCat());
    }

    @Test
    void bmiCatTestObesity() throws FileNotFoundException{
        BodyMassIndex e = new BodyMassIndex(60,180);
        System.setOut(new PrintStream(String.valueOf(e)));

        assertEquals("Your BMI category is: Obesity", e.bmiCat());
    }
}