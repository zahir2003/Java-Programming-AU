abstract class A
{
    abstract void cal(int x);
}

class B extends A
{
    void cal(int x)
    {
        System.out.println("Square is : "+(x*x));
    }
}

class C extends A
{
    void cal(int x)
    {
        System.out.println("Cube is : "+(x*x*x));
    }
}
public class ab
{
    public static void main(String[] args)
    {
        B ob1= new B();
        C ob2=new C();
        ob1.cal(2);
        ob2.cal(2);
    }
}
