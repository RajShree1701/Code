package interviewpractice;

import java.util.Scanner;

public class reverseofstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverse1(str));
        sc.close();
    }
    public static String reverse1(String str)
    {
        String s="";
        for(int i=0;i<str.length();i++)
        {
            s=str.charAt(i)+s;
        }
        return s;
    }
}
