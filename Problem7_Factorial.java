import java.util.*;
public class Problem7_Factorial {
    public static long factorial(int val)
    {
        long f=1;
        if(val==0)
            return 1;
        for(int i=1;i<=val;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int val=sc.nextInt();
        if(val>=0)
            System.out.println(val+"! = "+factorial(val));
        else
            System.out.println("Factorial is not defined for negative integers.");
        sc.close();
    }
}
