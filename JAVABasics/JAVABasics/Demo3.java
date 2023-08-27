package JAVABasics;
import java.util.*;
public class Demo3 {
    public static void main(String args[]){
        Scanner yash  = new Scanner(System.in);
        System.out.print("Enter the cost of a pencil:");
        float pencil = yash.nextFloat();
        System.out.print("Enter the cost of a pen:");
        float pen = yash.nextFloat();
        System.out.print("Enter the cost of a eraser:");   
        float eraser = yash.nextFloat(); 

        float total = pencil+pen+eraser;
        System.out.println("The total cost of products is:"+total);

        float bill = total+(0.18f*total);
        System.out.println("The bill of products with 18% gst is:"+bill);

    }
}
