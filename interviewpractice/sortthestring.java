package interviewpractice;

import java.util.Scanner;

public class sortthestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.nextLine();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
        }
        sortstring(n,str);
        sc.close();
    }
    public static void sortstring(int n,String str[])
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(str[j].compareTo(str[j+1])>0)
                {
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted");
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }
}
