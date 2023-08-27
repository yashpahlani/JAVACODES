package JAVAFunctionsandMethods;
import java.util.*;
public class Demo8{
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

public static void rangePrime(int n)
{
    for(int i = 2;i<=n;i++)
    {
        if(isPrime(i))
        {
            System.out.print(i+",");
        }
    }
    
}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number upto which you want to find prime number:");
        int n = sc.nextInt();
        System.out.print("The Range of Prime numbers:");
        rangePrime(n);
    }
    
    }


