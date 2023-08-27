package JAVABasics;
import java.util.*;
public class Demo4 {

    public static void main(String args[])
    {
        //Reverse technique 1
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter The number:");
        // int a = sc.nextInt();
        // while(a>0)
        // {
        //    int last=a%10;
        //     System.out.print(last);
        //     a=a/10;
        
        //Reverse Technique 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number:");
        int a = sc.nextInt();
        int rev=0;
        while(a>0){
            int last= a%10;
            rev=(rev*10)+last;
            a=a/10;
        }
        System.out.println(rev);

         }
        
    }
    

