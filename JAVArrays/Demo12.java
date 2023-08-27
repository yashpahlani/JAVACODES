package JAVArrays;
import java.util.*;
public class Demo12 {
    public static int maxArea(int[] height) {
        int max = 0;
        Arrays.sort(height);
        for(int i = 0;i<height.length;i++)
        {
            for(int j = 1;j<height.length;j++)
            {
                if(height[i]*height[j]>max)
                {
                     max=height[i]*height[j];
                }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
} 

    


