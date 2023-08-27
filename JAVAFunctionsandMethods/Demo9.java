//Binary to Decimal
package JAVAFunctionsandMethods;
import java.util.*;

public class Demo9 {
    public static void binToDec(int n)
    {
        int pow=0;
        int dec=0;

        while(n>0)
        {
            int last = n%10;
            dec=dec+(last)* (int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        System.out.print(dec);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number:");
        int binNum=sc.nextInt();
        System.out.print("The Decimal conversion of "+binNum+" is:");
        binToDec(binNum);


    }
    
}
