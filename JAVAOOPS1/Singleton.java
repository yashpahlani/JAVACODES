package JAVAOOPS1;

public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}

//yeh mujhe kam samjha hai