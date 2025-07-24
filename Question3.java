import java.util.*;
public class Question3 
{
    public static void main(String[] ags)
    {
         Scanner obj;
         obj=new Scanner(System.in);
         System.out.println("Enter an alphabet=");
         String input=obj.nextLine();
         if(input.equals("a")|| input.equals("e") ||input.equals("i")||input.equals("o")||input.equals("u"))
         {
            System.out.println("The alphabet is vowel");
         }
         else
         {
            System.out.println("The alphabet is consonant");
         }
    }
}
