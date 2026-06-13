import java.util.*;
public class Problem11_PerfectNumber
{
    public static boolean perfectNumber(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum+=i;
            else 
                continue;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Please enter a valid integer.");
        else
            System.out.println(perfectNumber(n)?"Perfect number":"Not a perfect number");
    }
}
