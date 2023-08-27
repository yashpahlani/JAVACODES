package JAVAOOPS2;

class Box
{
    static double height;
    static double width;  //here i created static because psvm is a static method 
    static double length;

    Box()
    {
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    //cube
    Box(double side)
    {
        this.height = side;
        this.width = side;
        this.length = side;
    }

    Box(double height,double width,double length)
    {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    Box(Box old)
    {
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }

    static void informationView()
    {
        System.out.println("Running the Box");
    }
}

class BoxWeight extends Box   //inheritance
{
    static double weight;
    BoxWeight()
    {
        this.weight = -1;
    }
    BoxWeight(double height,double width,double length,double weight)
    {
        super(height,width,length); //basically means call the parent class constructor
        this.weight = weight;  
    }
    BoxWeight(BoxWeight other)
    {
        super(other);//It is taking other of box weight but calling super
        // just above class constructor taking constructor of Box Type
        //Box obj7 = new BoxWeight() similar to this concept.
        weight = other.weight;
    }
    BoxWeight(double side,double weight)
    {
        super(side);
        this.weight =weight;
    }
static void informationView()
    {
        System.out.println("Running the BoxWeight class");
    }
}


class BoxPrice extends BoxWeight //MULTILEVEL INHERITANCE   
{
    double price;
    BoxPrice()
    {
        super();
        this.price= -1;
    }
    BoxPrice(BoxPrice other)
    {
        super(other);
        this.price = other.price;
    }
    BoxPrice(double height,double width,double length,double weight,double price)
    {
        super(height,width,length,weight);
        this.price = price;
    }
   BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}

class BoxColor extends BoxWeight    //Heirarchical Inheritance
{
    String color;
    BoxColor()
    {
        super();
        this.color = null;
    }
    BoxColor(BoxColor other)
    {
        super(other);
        this.color = other.color;
    }
    BoxColor(double height,double width,double length,double weight,String color)
    {
        super(height,width,length,weight);
        this.color = color;
    }
    BoxColor(double side,double weight, String color)
    {
        super(side,weight);
        this.color = color;
    }

}
// Multiple and Hybrid Inheritance is not supported in JAVA
public class Inheritance
{
    public static void main(String[] args) 
    {
        Box obj = new Box(5);
        System.out.println(obj.length+" "+obj.width+" "+obj.height);   
         Box obj2 = new Box();
        System.out.println(obj2.length+" "+obj2.width+" "+obj2.height); 
        Box obj3 = new Box(5,6,7);
        System.out.println(obj3.length+" "+obj3.width+" "+obj3.height);   
        Box obj4 = new Box(obj3);
        System.out.println(obj4.length+" "+obj4.width+" "+obj4.height);  

        //INHERITANCE 
        BoxWeight obj5 = new BoxWeight();
        System.out.println(obj5.length+" "+obj5.width+" "+obj5.height+" " + obj5.weight);
        BoxWeight obj6 = new BoxWeight(1,2,3,4);
        System.out.println(obj6.length+" "+obj6.width+" "+obj6.height+" " + obj6.weight);

        Box obj7 = new BoxWeight(1,2,3,4);
        //System.out.println(obj7.weight); //Important concept

        //BoxWeight obj8 = new Box(1,2,4);

        //multilevel
        BoxPrice obj9 = new BoxPrice(1, 2, 3);
        System.out.println(obj9.height + " "+ obj9.weight + " " + obj9.price);
        //there is no instance variable called side
        //Heirarchical Inheritance
        BoxColor obj10 = new BoxColor(1, 2, "blue");
        System.out.println(obj10.height + " "+ obj10.weight + " " + obj10.color);

        Box obj11 = new BoxWeight();
        obj11.informationView();

    }
}