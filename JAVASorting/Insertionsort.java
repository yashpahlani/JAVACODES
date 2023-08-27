package JAVASorting;

public class Insertionsort {

    public static void sort(int[] nums){
        for(int i =1;i<nums.length;i++)
        {
           int curr=nums[i];
           int prev=i-1;
           while(prev>=0 && nums[prev]>curr)
           {
                nums[prev+1] = nums[prev];
                prev--;
           }
           nums[prev+1] = curr;

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

