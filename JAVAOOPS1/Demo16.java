package JAVAOOPS1;

public class Demo16 {
    public static void main(String[] args) {
     //greeting();
     Demo16 obj = new Demo16();
    //  obj.greeting();     this does not work because greeting is static no need of creating objects
        
        obj.greeting2();

        Demo16 obj2 = new Demo16();
        obj2.fun();
    }

    static void greeting()
    {
        Demo16 obj = new Demo16();
        obj.fun();
       
    }

    void greeting2()
    {
        fun();
    }

    void fun()
    {
        System.out.println("Hello");
    }
    

}
