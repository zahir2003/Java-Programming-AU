class Staff
{
    String code,name;
    Staff()
    {
        code="c123";
        name="Sk Mahiduzzaman";
    }
    void display_staff()
    {
    System.out.println("Staff code is = "+code);
    System.out.println("Staff name is = "+name);
    }
}
class Academic_staff extends Staff
{
     String course;
     int no_of_publisher;

     Academic_staff()
     {
        course="Java";
        no_of_publisher=17;
     }
     void display1()
     {
     
     System.out.println("Course is = "+course);
     System.out.println("No_of_publisher is = "+no_of_publisher);
     }
}

class Permanent extends Academic_staff
{
    String date_of_joining;
    Permanent()
    {
        date_of_joining="23rd January";
    }
    void display2()
    {
        System.out.println("Date of joining is = "+date_of_joining);
    }
}

class Visiting extends Academic_staff
{
    int no_of_hours;
    Visiting()
    {
        no_of_hours=2;
    }
    void display3()
    {
        System.out.println("Visiting time is = "+no_of_hours+" hours");
    }
}

class Administrative_staff extends Staff
{
      String grade;
      Administrative_staff()
      {
        grade="A+";
      }
      void display4()
      {
        System.out.println("Grade is = "+grade);
      }
}

public class Assignment_8_q1 
{
    public static void main(String [] args)
    {
        Academic_staff obj1=new Academic_staff();
        Permanent obj2=new Permanent();
        Visiting obj3=new Visiting();
        Administrative_staff obj4=new Administrative_staff();
        obj1.display_staff();
        obj1.display1();
        obj2.display2();
        obj3.display3();
        obj4.display4();
    }
}
