class one
{
    int x;
    two t;
    one(two t)
    {
        this.t=t;
        x=10;
    }
    void display()
    {
        System.out.println("One is = "+x);
        int sum ;
        sum = x+t.display();
    }
}

class two{
    int y;
    two(int y)
    {
        this.y=y;
    }
    void display()
    {
        System.out.println("Second y is = "+y);
        return y;
    }
}

class Practise
{
    
    public static void main(String [] args)
    {
      two obj2=new two(22);
      one obj1=new one(obj2);
      obj1.display();

    }
}

