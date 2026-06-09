import java.util.*;
public class Problem6_SumOfDigits {
    public static int sumOfDigits(int val)
    {
        int sum=0,rem;
        while(val!=0)
        {
            rem=val%10;
            sum+=rem;
            val/=10;
        }
        return sum;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int val=sc.nextInt();
        System.out.println("Sum of digits of number "+val+" is "+sumOfDigits(val));
        sc.close();
    }
}
