import java.util.*;

public class ArrayConverter {

    // Convert array to ArrayList
    public static <T> ArrayList<T> convertArrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // Convert ArrayList to array
    public static <T> T[] convertArrayListToArray(ArrayList<T> arrayList, T[] array) {
        return arrayList.toArray(array);
    }
}
