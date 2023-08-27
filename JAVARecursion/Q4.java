package JAVARecursion;
//reverse a number : - 54321:-12345
public class Q4 {
    public static void main(String[] args) {
        rev(12345);
        System.out.println(sum);

    }
    //method 1
    static int sum=0;
    static void rev(int n)
    {
        if(n==0)
        {
            return;
        }

        int rem = n%10;
        sum = sum*10+rem;
        rev(n/10);

    }

    //method 2
}
