package interviewpractice;

import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(palindromestr(str));
        sc.close();
    }
    public static boolean palindromestr(String str)
    {
        String s="";
        String original=str;
        for (int i=0;i<str.length();i++)
        {
            s=str.charAt(i)+s;
        }
        return s.equals(original);
    }
}
