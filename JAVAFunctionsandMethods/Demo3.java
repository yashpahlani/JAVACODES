package JAVAFunctionsandMethods;
import java.util.*;
public class Demo3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.print("The Factrorial of the number "+n+" is:"+factorial);


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

}
