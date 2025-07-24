class A
{
   void displayA()
  {
    System.out.println("First Class");
  }
}

class B
{
   void displayB()
   {
    System.out.println("Second class");
   }
}

class C extends  A
{
    void displayC()
    {
        System.out.println("Third Class");
    }
}

public class Assignment_8_q2 
{
    public static void main(String [] args)
    {
        C ob1=new C();
        B ob2=new B();
        ob1.displayA();
        ob2.displayB();
        ob1.displayC();
    }
}
