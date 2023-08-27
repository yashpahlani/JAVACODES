package JAVArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
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
        System.out.println("The Maximum Value in an Array: "+max(arr));
        System.out.println("Let find the Maximum value between the range");
        System.out.println("");
        System.out.print("Enter the Starting Index:");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Index:");
        int end = sc.nextInt();
        System.out.println("The Maximum value between the range "+ start + " to "+ end +" is:"+ maxRange(arr,start,end));
        
    }
    public static int max(int[] arr)
    {
        int maxVal = arr[0];
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>maxVal)
           {
                maxVal=arr[i];
           }
        }
        return maxVal;  
    }
    
        public static int maxRange(int[] arr,int start,int end)
    {
        int maxVal = arr[start];
        for(int i=start;i<end;i++)
        {
           if(arr[i]>maxVal)
           {
                maxVal=arr[i];
           }
        }
        return maxVal;

        
    }

}
