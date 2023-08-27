package JAVABasics;
import java.util.*;
public class Demo7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        boolean Prime = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                Prime=false;
            }
        }
        if(Prime==true)
        {
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not Prime");

        }
    
}
}
