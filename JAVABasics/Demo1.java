package JAVABasics;

import java.util.*;
class Demo1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int A = sc.nextInt();
        System.out.println("Enter Number 2:");
        int B = sc.nextInt();
        System.out.println("Enter Number 3:");
        int C = sc.nextInt();
        int Average = (A+B+C)/3;
        System.out.println("The Average of the Three Numbers is :"+Average);

    }
}