//i have value n i have to print value till 1
package JAVARecursion;

public class Q1 {
    public static void main(String[] args) {
        num(5);
        System.out.println();
        numRev(5);
        System.out.println();
        numn(5);
     
    }

    static void num(int n)
    {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        num(n-1);

    }
    static void numRev(int n)
    {
        if(n==0){
            return;
        }

        numRev(n-1);
        System.out.print(n+" ");
    }

    //N-- VS -- N  N-- pass n then subtract which causes infinite recursion
    // while --N subtract first then apass the value

    static void numn(int n)
    {

        if(n==0){
            return;
        }
        System.out.print(n+" ");
        numn(--n);
    }
}
