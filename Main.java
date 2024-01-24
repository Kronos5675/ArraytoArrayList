import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Taking user input for array
        String[] inputArray = UserInput.takeUserInputArray();
        // Converting array to ArrayList
        ArrayList<String> arrayList = ArrayConverter.convertArrayToArrayList(inputArray);
        // Displaying the ArrayList
        displayArrayList(arrayList);
        // Converting ArrayList back to array
        // Converting ArrayList back to array
        String[] outputArray = ArrayConverter.convertArrayListToArray(arrayList, new String[0]);
        // Displaying the array
        displayArray(outputArray);
    }
    // Displaying ArrayList elements
    public static void displayArrayList(ArrayList<String> arrayList) {
        System.out.println("ArrayList elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
    // Displaying array elements
    public static void displayArray(String[] array) {
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}