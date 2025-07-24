import java.util.*;
import java.io.*;

public class exam_score 
{
    public static void main(String[] args) throws IOException
    {
        float ans;
        student obj = new student();
        obj.input();
        ans = obj.total();
        System.out.println("The total marks of the student is = " + ans);
    }
}

class student
{
    float s1, s2, s3, s4, s5;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the score of subject 1: ");
            s1 = sc.nextFloat();
            System.out.print("Enter the score of subject 2: ");
            s2 = sc.nextFloat();
            System.out.print("Enter the score of subject 3: ");
            s3 = sc.nextFloat();
            System.out.print("Enter the score of subject 4: ");
            s4 = sc.nextFloat();
            System.out.print("Enter the score of subject 5: ");
            s5 = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            sc.close();
        }
    }

    float total()
    {
        float t = s1 + s2 + s3 + s4 + s5;
        return t;
    }
}