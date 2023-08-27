package JAVAOOPS1;

class Hello{
    static void print()
    {
        System.out.println("Hello");
    }
    static void print(String name)  //Overloading
    {
        System.out.println(name);
    }
}
class World extends Hello{
    static void print() //Overriding
    {
        System.out.println("Hello World");
    }
}
public class Demo15 {
    public static void main(String args[])
    {
        World.print();
        Hello.print("Yash");
        Hello.print();
    }
}
