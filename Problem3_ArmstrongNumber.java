import java.util.*;
public class Problem3_ArmstrongNumber {
    public static String isArmstrong(int val)
    {
        int rem,s=0,m=val;
        while(val>0)
        {
            rem=val%10;
            s=s+(int)Math.pow(rem,String.valueOf(m).length());
            val=val/10;
        }
        if(s==m)
            return "Armstrong number";
        else
            return "Not an Armstrong number";
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int val=sc.nextInt();
        String result=isArmstrong(val);
        System.out.println(result);
    }
}
