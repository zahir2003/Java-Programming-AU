class arith
{
    static int  a,b;
    arith(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    static void add()
    {
        System.out.print("="+(a+b));
    }
}


public class test0 {
    public static void main(String[] xyz)
    {
        arith obj = new arith(1,5);
        arith.add();
    }
    
}
