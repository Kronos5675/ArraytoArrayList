import java.util.*;

public class UserInput {

    // Method to take user input for array
    public static String[] takeUserInputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements of the array (separated by spaces): ");
        String input = scanner.nextLine();

        // Split the user input into an array
        String[] array = input.split("\\s+");

        scanner.close();
        return array;
    }
}

