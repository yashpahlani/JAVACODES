package JAVAOOPS1;
class Student{
    int rno;
    String name;
    int marks;
    
    Student(){
        this.rno =49;
        this.name = "Yash";
        this.marks = 99;
    }

    // Constructor Overloading
    Student(int rollno, String naam,int marks)
    {
        this.rno = rollno;
        this.marks = marks;
        this.name = naam;

    }

}
public class Demo14 {
    public static void main(String args[])
    {
        Student s = new Student();
        
        // System.out.println(s.name);
    }
}
