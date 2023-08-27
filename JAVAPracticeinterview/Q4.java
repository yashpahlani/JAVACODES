package JAVAPracticeinterview;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,5,4};
        int arr2[] = new int[arr.length];
        int index = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr2[index]=arr[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }
    
}
