import java.util.*;
public class Problem2_PalindromeNumber {
    public static boolean isPalindrome(int val)
    {
        int rev=0,rem,m=val;
        if (val<0)
            return false;
        while(val!=0)
        {
            rem=val%10;
            rev=rev*10+rem;
            val=val/10;
        }
        return rev==m;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(isPalindrome(n)?"Palindrome number":"Not a palindrome");
        sc.close();

    }
}
