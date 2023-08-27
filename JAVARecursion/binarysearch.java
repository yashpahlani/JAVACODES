package JAVARecursion;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=5;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int[] arr , int target,int start, int end)
    {
        if(start>end)
        {
            return -1;
        }

        int m = start + (end - start)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[m]>target)
        {
            return search(arr , target, start , m-1);
        }
        else{
            return search(arr , target, m+1 , end);
        }
    }
}
