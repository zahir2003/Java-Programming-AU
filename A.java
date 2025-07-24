
 abstract class B
 {
    abstract void  calculate(double x);
 }
 class sub1 extends B
 {
    void calculate(double x)
    {
        System.out.println("Square is = "+(x*x));
    }
 }

 class sub2 extends B
 {
    void calculate(double x)
    {
        System.out.println("Square root = "+Math.sqrt(x));
    }
 }

 class sub3 extends B
 {
    void calculate(double x)
    {
        System.out.println("Cube is = "+(x*x*x));
    }
 }
class A 
{
    
    public static void main(String [] args)
    {
       sub1 ob1=new sub1();
       sub2 ob2=new sub2();
       sub3 ob3=new sub3();
       ob1.calculate(12);
       ob2.calculate(23);
       ob3.calculate(32);
    }
}
