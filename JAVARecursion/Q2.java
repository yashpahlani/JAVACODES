package JAVARecursion;
//factorial using recursion
//sum of n numbers
public class Q2 {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
    static int fact(int n)
    {
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    static int sum(int n)
    {
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
    }

