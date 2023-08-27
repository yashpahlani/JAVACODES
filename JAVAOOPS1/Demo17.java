    package JAVAOOPS1;

    public class Demo17 {
        static int a = 4;
        static int b;

        //the static block runs once when the first object is created i.e 
        //when the class is loaded for the first time
        static {    //static block
            System.out.println("I am in the Static Block");
            b = a*5;
        }
        public static void main(String[] args) {
            Demo17 obj = new Demo17();
            System.out.println(Demo17.a+" "+Demo17.b);
            Demo17.b+=3;
            System.out.println(Demo17.a+" "+Demo17.b);
            Demo17 obj2 = new Demo17();
            System.out.println(Demo17.a+" "+Demo17.b);
            //the output of this is usually be 4,20 
            //but it is 4,23
            //but the static block runs once when the first object is created i.e 
            //when the class is loaded for the first time
        



        }
        
    }
