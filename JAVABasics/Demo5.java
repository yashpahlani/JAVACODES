package JAVABasics;
import java.util.*;
public class Demo5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        do{
             System.out.print("Enter The Number:");
             int n = sc.nextInt();
             if(n%10==0)
             {
                break;
             }
             System.out.println(n);
        }
        while(true);
    }
    
}
