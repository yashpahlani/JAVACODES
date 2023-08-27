package JAVAOOPS2;
class Numbers
{
    //void area(int a, String b){} //Method Overloading 

    //void area(String b, int a){}//Method Overloading change in Ordering:-Order of type should be different
    //Method Overloading yeh change in  ordering wala case hai 
    //agr a, b dono int hote the toh ordering ka effect nahi hota 
    //int a,int b == int b, int a

    int sum(int a,int b)//Method of overloading in number of parameters
    {
         return a +b;
    }
    int sum(int a,int b,int c)
    { 
        return a +b+c;
    }

    
}



public class PolymorphismOL {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(1,2); 
        num.sum(1,2,3);//method overloading
        
    }
    
}
