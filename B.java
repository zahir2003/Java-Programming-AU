class Test 
{
    static int i=20;
    void display()
    {
        System.out.println("The value is = "+i);
    }

    class A
    {
        void show()
        {
            System.out.println("Zahir");
        }
    }
}

class B
{
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.display();
        Test.A obj1=obj.new A();
        obj1.show();

    }
}
