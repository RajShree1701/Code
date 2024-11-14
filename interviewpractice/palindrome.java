package interviewpractice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(palindrome1(n));
        sc.close();
    }
    public static boolean palindrome1(int n)
    {
        int num=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev==num;// return true or false according to input and logic
    }
}
