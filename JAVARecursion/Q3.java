package JAVARecursion;
//sum of digit 1343 = 1+3+4+3=11
//recursion logic 1+f(343)
//                 3+f(43) and so on

//recurrence equation = (N%10)+f(N/10)=======> N%10 gives remainder
//                      3+f(134) then
//                          4+f(13)

//similarly for digit product
public class Q3 {
    public static void main(String[] args) {
        System.out.println(sumdig(1340));
        System.out.println(proddig(1340));
    }

    static int sumdig(int n)
    {
        if(n==0)
        {
            return n;
        }
        return (n%10)+sumdig(n/10);
    }
    static int proddig(int n)
    {
        if(n%10 == n)//lat digit
        {
            return n;
        }
        return (n%10)*proddig(n/10);
    }
}
