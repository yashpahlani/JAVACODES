package JAVAPracticeinterview;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (index < 2 || arr[i] != arr[index - 2]) {
                arr[index++] = arr[i];
            }
        }
        int[] arr2 = new int[index];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}
    