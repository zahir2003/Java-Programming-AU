import java.util.*;

class A
{
    double pi = 3.14;
    float r;
    float w,l;
    float h,b;
}

class B extends A
{
    Scanner obj=new Scanner(System.in);
    void Circle_area()
    {
        System.out.println("Enter radius = ");
        r = obj.nextFloat();
        System.out.println("Area of circle is = "+(pi*r*r));
    }
}

class C extends B 
{

    void Rectangle_area()
    {
        System.out.println("Enter length and width= ");
        l = obj.nextFloat();
        w = obj.nextFloat();
        System.out.println("Area of rectangle is = "+(l*w));
    }

}

class D extends C 
{

    void Triangle_area()
    {
        System.out.println("Enter breadth and hight = ");
        h = obj.nextFloat();
        b = obj.nextFloat();
        System.out.println("Area of triangle is = "+(0.5*h*b));
    }

}

class main2
{
    public static void main(String [] args)
    {
        B ob = new B();
        C ob1 = new C();
        D ob2 = new D();
        ob.Circle_area();
        ob1.Rectangle_area();
        ob2.Triangle_area();
    }
}