package JAVAFunctionsandMethods;
import java.util.*;
class Demo1{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        float a = sc.nextFloat();
        System.out.print("Enter Number 2:");
        float b= sc.nextFloat();
        float sum = calculateSum(a,b);// a,b are Arguments/actual parameters used in calling function
        
        System.out.println("Sum is :"+sum);
    }
    public static float calculateSum(float num1,float num2)//formal parameters
    {
        float sum = num1 + num2;   //here variable sum is different then the sum mention above
        return sum;
    }
}