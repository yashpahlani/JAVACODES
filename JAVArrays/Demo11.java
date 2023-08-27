package JAVArrays;

public class Demo11 {
        public static int subarraysDivByK(int[] nums, int k) {
            int arr =0;
            for(int i = 0;i<nums.length;i++)
            {
                for(int j = 1;j<nums.length;j++)
                {
                    if((nums[i]+nums[j])%k==0)
                    {
                        arr++;
                    }
                    // else{
                    //     j++;
                    // }
                }
            }
            return arr;
        
    }
        public static void main(String args[])
        {
            int[] nums = {4,5,0,-2,-3,1};
            int k = 5;
            System.out.println(subarraysDivByK(nums,k));
        }
}


