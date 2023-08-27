//Call by value and call by reference prove
package JAVArrays;
public class Demo1 {
    
    public static void toUpdate(int array[],int nonChangeable)
    {
        nonChangeable=15;
        for(int i=0;i<array.length;i++)
        {
            array[i]=array[i]+2;
        }
    }

    public static void main(String args[])
    {
        int array[] = {10,12,13};
        int nonChangeable=10;
        toUpdate(array,nonChangeable);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");  //Call by reference
        }
        System.out.println("\n"+nonChangeable+" "); //call by value
    }
    
}

//Arrays are call by reference