import java.util.*;
public class Problem10_StrongNumber
{
    public static boolean strongNumber(int n)
    {
        int sum=0,rem,m=n;
        if(n==0)
            return false;
       while(n>0)
        {
            rem=n%10;
            int f=1;
            for(int i=1;i<=rem;i++)
            {
                f=f*i;
            }
            sum+=f;
            n/=10;
        }
        return sum==m;

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Please enter a non-negative integer.");
        else
            System.out.println(strongNumber(n)?"Strong number":"Not a Strong number");
        sc.close();
    }
}
