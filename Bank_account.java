import java.util.*;
public class Bank_account {
    public static void main(String [] args)
    {
        String Depositor_name;
        double acc_no;
        String Acc_type;
        float balance;
        //float deposit_money;
        Scanner obj=new Scanner(System.in);
        
        void initial_values()
        {
            System.out.println("Enter the name of depositor = ");
            String Depositor_name=obj.nextLine();
            System.out.println("Enter account number = ");
            double acc_no=obj.nextDouble();
            System.out.println("Enter your account type Current/Savings = ");
            String acc_no=obj.nextLine();
            System.out.println("Enter balance amount in the account =");
            float balance=obj.nextFloat();
           // System.out.println("Enter the amount of deposit money = ");
           // deposit_money=obj.nextFloat();
        }

        void deposit()
        {
            float deposit_amount;
            float total;
            System.out.println("Enter the amount of deposit money = ");
            float deposit_amount=obj.nextFloat();
            total=balance+deposit_amount;
            System.out.println("After deposit the total balance will be = "+total);
        }

        
    } 
}
