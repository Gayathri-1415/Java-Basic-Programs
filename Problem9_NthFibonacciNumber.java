import java.util.*;
public class Problem9_NthFibonacciNumber
{
    public static int nthFibonacciNumber(int n)
    {
        int f0=0,f1=1,temp=0;
        if(n==1)
            return f0;
        if(n==2)
            return f1;
        for(int i=3;i<=n;i++)
        {
            
            temp=f0+f1;
            f0=f1;
            f1=temp;
        }
        return f1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        if(n<=0)
           System.out.println( "Term number must be greater than 0.");
        else
            System.out.println(n+"th term in series: "+nthFibonacciNumber(n));
    }
}
