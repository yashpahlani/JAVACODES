package JAVArrays;

public class Demo8
{
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i]; // Found the duplicate number
                }
            }
        }
        return -1; // If no duplicate found (optional)
    }

    public static void main(String args[])
    {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    
}
