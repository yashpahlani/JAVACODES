package JAVASorting;

public class Mergesort {
    public static void sort(int[] nums,int str,int end)
    {
        if(str>=end)
        {
            return;
        }
        int mid = str+(end-str)/2;
        sort(nums,str,mid);//left part
        sort(nums, mid+1, end);   //right part   
        
        merge(nums,str,end,mid);
    }

    public static void merge(int[] nums,int str,int end,int mid)
    {
        int[] temp = new int[end-str+1];
        int i  = str; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0;//iterator for temp array

        while(i<=mid && j<=end)
        {
            if(nums[i]<nums[j])
            {
                temp[k]=nums[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=nums[j];
                j++;
                k++;
            }
        }
        //leftover elements of left part
        while(i<=mid)
        {
            temp[k++] = nums[i++];
        }
        //leftover elements of right part
          while(j<=end)
        {
            temp[k++] = nums[j++];
        }

        //cpy temp to org array
        for(k=0,i=str;k<temp.length;k++,i++)
        {
            nums[i]=temp[k];
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
        sort(nums,0,nums.length-1);
        System.out.println();
        System.out.println("After Sorting:");
        print(nums);
    }
}


