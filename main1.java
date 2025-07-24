interface A
{
    public abstract void play();
}

class Football implements A
{
    public void play()
    {
        System.out.println("This is Football");
    }
}

class Volleyball implements A
{
    public void play()
    {
        System.out.println("This is Volleyball");
    }
}

class Basketball implements A
{
    public void play()
    {
        System.out.println("This is Basketball");
    }
}

class main1
{
    public static void main(String [] args)
    {
        Football ob1=new Football();
        Volleyball ob2=new Volleyball();
        Basketball ob3=new Basketball();
        ob1.play();
        ob2.play();
        ob3.play();
    }
}
