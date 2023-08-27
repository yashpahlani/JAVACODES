package JAVAOOPS1;

public class Demo18 {
   static  class Test //This class is depend on the outer class Demo18 so it need an object to access 

    {
        String name;
        public Test(String name){
            this.name = name;
        }

    }
   
    public static void main(String[] args) {
        //Demo18 obj = new Demo18();
        //Demo18.Test obj2 = obj.new Test("Yash");
        //if you not want the inner class to be static this is the way to create the object for it 
        

        Test a = new Test("yash");
        Test b = new Test("Pahlani");
        
        System.out.println(a.name);
        System.out.println(b.name);

        //op is yash and pahlani
        //now the question is how as static doesnot depend on object 
        //as we see on Demo17 it should print yash and yash

        //The answer is in demo17 there is static block not static class
        //like internally main and test depend on each other 
        //but doesnot depend on Demo18 clss
    }
}
