/*function Overloading using datatype*/
//Function can have same name but should have different number of parameters or 
//diffrent datatype parameter
package JAVAFunctionsandMethods;
public class Demo6 {

    public static int add(int a,int b)
    {
        return a+b;
    }
        public static float add(float a,float b,float c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println("The sum of 3 and 8 is "+add(3,8));
        System.out.println("The sum of 3.2,8.2 & 9 is "+add(3.2f,8.2f,9));
    }   
}
