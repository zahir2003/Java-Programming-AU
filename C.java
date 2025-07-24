class A
{
    int display(int a,int b)
    {
        System.out.println("The sum is = "+(a+b));
        return 0;
    }
}

class B extends A
{
   int display(int a,int b)
    {
        super.display(a,b);
        System.out.println("The multiplication is = "+(a*b));
        return 0;
    }
}

class C
{
    public static void main(String [] args)
    {
        B obj = new B();
        obj.display(4,5);
    }
}