//Input and Output 2D Arrays
package JAVArrays;
import java.util.*;
public class Demo3 {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int arr [][] = new int[3][3];
        

        for(int row = 0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }

        // for(int row = 0;row<arr.length;row++)
        // {
        //     for(int col=0;col<arr[row].length;col++)
        //     {
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int row = 0;row<arr.length;row++)
        // {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // Enhanced for loop
        for(int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }


    
    }    
}
