//Swap elements of Array
package JAVArrays;
import java.util.*;
public class Demo4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the "+i+" element of an array:");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the first elements index which you want to swap : ");
        int a = sc.nextInt();
        System.out.print("Enter the second elements index which you want to swap : ");
        int b = sc.nextInt();

        swap(arr,a,b);
        System.out.println("The Array After Swapping Elements: "+Arrays.toString(arr));
    }

    public static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    

    
}
