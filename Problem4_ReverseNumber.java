import java.util.*;
public class Problem4_ReverseNumber 
{
    public static int reverseNumber(int val)
    {
        int rem,rev=0;
        while(val!=0)
        {
            rem=val%10;
            rev=rev*10+rem;
            val=val/10;
        }
        return rev;
    }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number: ");
            int val=sc.nextInt();
            int result=reverseNumber(val);
            System.out.println("Reverse of "+val+" is "+result);
            sc.close();

        }
}

