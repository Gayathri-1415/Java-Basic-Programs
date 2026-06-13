import java.util.*;
public class Problem8_FibonacciSeries
{
    public static void fibonacciSeries(int n)
    {
        int  f0=0,f1=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(f0+" ");
            int temp=f0+f1;
            f0=f1;
            f1=temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms.");
        int n=sc.nextInt();
        if(n>0)
        {
        System.out.println("Fibonacci Series: ");
        fibonacciSeries(n);
        }
        else
            System.out.println("Please enter a non-negative number of terms.");

    }
}
