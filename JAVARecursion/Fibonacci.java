package JAVARecursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibo(n));
        for(int i = 0;i<n;i++)
        {
            System.out.print(fibo(i)+" ");
        }
    
    }
    //return the value of fibonacci number at n position
    static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        
        return fibo(n-1)+fibo(n-2);
    }
}
//pls refer fibonaccitree.png for working