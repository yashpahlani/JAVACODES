package JAVASorting;

public class Selectionsort {
    
    public static void sort(int[] nums){
        for(int turn = 0 ;turn<nums.length-1;turn++){
            int min = turn;
        for(int i =turn+1;i<nums.length;i++)
        {
            if(nums[min]>nums[i])
            {
                min = i;
            }
        }
        int temp = nums[min];
        nums[min]=nums[turn];
        nums[turn]=temp;

        }
        
    }
    public static void print(int[] nums)
    {
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int[] nums = {3,4,5,1,2};
        System.out.println("Before Sorting:");
         print(nums);
        sort(nums);
        System.out.println();
        System.out.println("After Sorting:");
        print(nums);
    }
}

