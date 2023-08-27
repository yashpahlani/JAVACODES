//Move Zeros
package JAVArrays;

import java.util.*;

public class Demo6 {
    public static void moveZeroes(int[] nums) 
    {
        int counter=0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[counter++]=nums[i];
            }
        } 

    while(counter<nums.length)
    {
        nums[counter++]=0;
    }
    }
public static void main(String args[])
{
    int[] nums={0,1,0,3,2};
    moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
}

}


