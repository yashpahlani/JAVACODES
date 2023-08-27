package JAVAPracticeinterview;

import java.util.*;

public class Q3 {
        public static int removeElement(int[] nums, int val) {
            int count = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    count++;
                }
            }
            int nums2[] = new int[count];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums2[index] = nums[j];
                    index++;
                }
    
            }
            System.out.println(Arrays.toString(nums2));
           return nums2.length; 
        }

        public static void main(String[] args) {
        int arr[] = { 0,1,2,2,3,0,4,2 };
        int x=removeElement(arr,2);
        System.out.println(x);
    }
    }

