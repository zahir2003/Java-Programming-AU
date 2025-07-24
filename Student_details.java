import java.io.IOException;
import java.util.*;

public class Student_details
{
    public static void main (String[] arg) throws IOException
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String n=sc.nextLine();
        System.out.print("Enter student id :");
        String i=sc.nextLine();
        Student obj = new Student();
        obj.pass_val(n,i);
        obj.display();
     }
}

class Student
{
    String s_name;
    String s_id;
    void pass_val(String name,String id)
    {
        s_name=name;
        s_id=id;
    }
    void display()
    {
        System.out.println("The Student name is : "+s_name);
        System.out.println("The student id is :"+s_id);
    }
}