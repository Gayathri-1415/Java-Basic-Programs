import java.util.*;
class Problem1_PrimeCheck
{
    public static boolean PrimeCheck(int val)
    {
        int i;
        if(val<=1)
            return false;

        for(i=2;i<=Math.sqrt(val);i++)
        {
            if(val%i==0)
                return false;  
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int val=sc.nextInt();
        System.out.println(PrimeCheck(val)?"Prime Number":"Not a prime number");
    sc.close();
    }
}