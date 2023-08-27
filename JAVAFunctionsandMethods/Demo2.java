package JAVAFunctionsandMethods;
import java.util.*;
public class Demo2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int a = sc.nextInt();
        System.out.print("Enter Number 2:");
        int b = sc.nextInt();
        int product = calculateProduct(a,b);
        System.out.println("The Product of two Numbers is:"+product);
    }
    public static int calculateProduct(int num1,int num2)
    {
        int product = num1*num2;
        return product;
    }
    
}
