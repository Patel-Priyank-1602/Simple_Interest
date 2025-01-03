import java.util.*;
class savings_interst
{
    void Savings_interst(int amount,int year)
    {
        double rate = 2.7;
        double intrest=(((amount*rate)/100)+amount);
        System.out.println("Your Savings Intrest : "+intrest);
    }
}
class fd_intrest extends savings_interst
{
    void Fd_intrest(int amount,int year)
    {
        if (year==1)
        {
            double rate = 6.9;
            double intrest = amount + ((amount * rate * year)/100);
            System.out.println("Your FD Intrest : "+intrest);
        }
        if (year==2)
        {
            double rate = 7.2;
            double intrest = amount + ((amount * rate * year)/100);
            System.out.println("Your FD Intrest : "+intrest);
        }
        if (year==3)
        {
            double rate = 6.75;
            double intrest = amount + ((amount * rate * year)/100);
            System.out.println("Your FD Intrest : "+intrest);
        }
        if (year==4)
        {
            double rate = 7.25;
            double intrest = amount + ((amount * rate * year)/100);
            System.out.println("Your FD Intrest : "+intrest);
        }
        if (year>=5)
        {
            double rate = 7.8;
            double intrest = amount + ((amount * rate * year)/100);
            System.out.println("Your FD Intrest : "+intrest);
        }

    }
}
public class Intrest 
{
    public static void main(String[] args)
    {
        System.out.println("Here We Assume that You Are SBI Customer");
        System.out.println();

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Amount You Invest : ");
        int amount = Sc.nextInt();

        System.out.print("Enter Year You Invest : ");
        int year = Sc.nextInt();

        fd_intrest obj1 = new fd_intrest();
        obj1.Fd_intrest(amount,year);
        obj1.Savings_interst(amount,year);
    }
}
