import java.util.Arrays;
public class Encrypter {

    public String encrypt(String initialString) {

        int[] intArray = new int [4];

        stringToIntArray(intArray, initialString);
        modArray(intArray);
        swapElements(intArray);

        String finalString = Arrays.toString(intArray);
        return finalString.replaceAll(",", "").replace("[","").replace
                 ("]","").replace(" ", "");
    }

    public void stringToIntArray(int[] array, String str) {

        for(int i = 0; i < array.length; i++) {

            array[i] = Character.getNumericValue(str.charAt(i));

        }
    }

    public void modArray(int[] array) {

        for(int i = 0; i < array.length; i++) {

            array[i] = (array[i] + 7) % 10;

        }
    }

    public void swapElements(int [] array) {
        int temp, temp2;

        temp = array[0];
        array[0] = array[2];
        array[2] = temp;
        temp2 = array[1];
        array[1] = array[3];
        array[3] = temp2;
    }
}
