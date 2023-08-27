package JAVASorting;


public class Bubblesort {

    public static void sort(int[] nums)
    {
        // main(["Yash"]);
        for(int turn = 0 ;turn<nums.length-1;turn++)
        {
            for(int i = 0;i<nums.length-1-turn;i++)
            {
                if(nums[i]>nums[i+1])
                {
                    int temp = nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
    }

        public static void print(int[] nums)
        {
            for(int i =0;i<nums.length-1;i++)
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
