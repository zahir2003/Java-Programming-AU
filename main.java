interface A
{
   public abstract void show();
}

interface B
{
    public abstract void display();
}

class Newclass implements A,B
{
    public void show()
    {
        System.out.println("Apple");
    }

    public void display()
    {
        System.out.println("Ball");
    }

}

class main{
    public static void main(String [] args)
    {
        Newclass obj = new Newclass();
        obj.show();
        obj.display();
    }
}