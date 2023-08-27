/*function Overloading using parameters*/
//Function can have same name but should have different number of parameters or 
//diffrent datatype parameter
package JAVAFunctionsandMethods;
public class Demo5 {

    public static int add(int a,int b)
    {
        return a+b;
    }
        public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println("The sum of 3 and 8 is "+add(3,8));
        System.out.println("The sum of 3,8 & 9 is "+add(3,8,9));
    }   
}
