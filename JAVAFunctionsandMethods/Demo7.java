package JAVAFunctionsandMethods;
import java.util.*;
public class Demo7 {
    
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        boolean prime = isPrime(n);
        System.out.print("The Number "+n+" is "+prime);


    }

}
