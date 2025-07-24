public class Pattern_print2
{
    public static void main(String [] args)
    {
        int i,j,k=5;
        for(i=1;i<=k;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=k;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}