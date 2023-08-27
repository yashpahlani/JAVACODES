package JAVAOOPS2;
class Shapes
{
    void area() //final keyword can prevent overriding
    {
        System.out.println("This is a shape");
    }
}
class Circle extends Shapes
{
    @Override
     void area() //Overriding
    {
        System.out.println("The area of circle is ");
    }


}
class Triangle extends Shapes
{
 void area()//Overriding
    {
        System.out.println("The area is 0.5*b*h:");
    }

}
class Square extends Shapes
{
//This run when the object of square is creates
//It Overrides the parent method area
 void area()//Overriding
    {
        System.out.println("Area is side * side:");
    }

}

public class PolymorphismOR {
    public static void main(String[] args) {
        
    }
    
}
