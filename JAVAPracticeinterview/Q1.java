//Remove Duplicates from Sorted Array 
package JAVAPracticeinterview;
import java.util.*;
class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 1};
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        int[] arr3 = new int[count];
        for (int i = 0; i < count; i++) {
            arr3[i] = arr[i];
        }
        System.out.println(arr3.length);

    }
}
