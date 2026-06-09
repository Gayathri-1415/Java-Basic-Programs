import java.util.*;
public class Problem5_CountDigits {
    public static int countDigits(int val)
    {
        int count=0;
        if(val==0)
        {
            return 1;
        }
        while(val!=0)
        {
            count++;
            val/=10;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int val=sc.nextInt();
        System.out.println("No of digits of "+val+" are "+countDigits(val));
        sc.close();

    }
}
