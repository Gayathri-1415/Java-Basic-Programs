import java.util.*;
public class Problem12_HarshadNumber
{
    public static boolean harshadNumber(int n)
    {
        int rem,sum=0,m=n;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        return m%sum==0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Please enter a positive integer.");
        else
            System.out.println(harshadNumber(n)?"Harshad Number":"Not a Harshad Number");
        sc.close();
    }

}
