import java.util.Arrays;
public class Decrypter {

    public String decrypt(String initialString) {

        int[] intArray = new int [4];

        stringToIntArray(intArray, initialString);
        undoModArray(intArray);
        swapElements(intArray);

        String finalString = Arrays.toString(intArray);
        return finalString.replaceAll(",", "").replace("[","").replace
                ("]","").replace(" ", "");

    }

    public void stringToIntArray(int[] array, String str)
    {
        for(int i = 0; i < array.length; i++) {

            array[i] = Character.getNumericValue(str.charAt(i));

        }
    }

    public void swapElements(int[] array) {

        int temp, temp2;

        temp = array[0];
        array[0] = array[2];
        array[2] = temp;
        temp2 = array[1];
        array[1] = array[3];
        array[3] = temp2;
    }

    public void undoModArray(int[] array) {

        for(int i = 0; i < array.length; i++) {

            if (array[i] == 7 || array[i] == 8 || array[i] == 9) {
                array[i] = array[i] - 7;
            }
            else if (array[i] == 0) {
                array[i] = 3;
            }
            else {
                array[i] = array[i] + 3;
            }
        }

    }
}
