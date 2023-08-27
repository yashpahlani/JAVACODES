//Binomial Function
package JAVAFunctionsandMethods;
import java.util.*;
public class Demo4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of r:");
        int r = sc.nextInt();
        int bin = binomial(n,r);
        System.out.println("The Binomal Distribution Value of "+n+" and " +r +" is :"+bin);
        
    }
     public static int fact(int n)
    {
        int f = 1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    public static int binomial(int n,int r)
    {
        int fact_n = fact(n);
        int fact_r =fact(r);
        int fact_nmr=(fact(n-r));
        int binomial=fact_n/(fact_r*fact_nmr);
        return binomial;

    }
}
