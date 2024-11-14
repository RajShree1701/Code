package interviewpractice;
import java.util.Scanner;
public class fibbo {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibbo1(n);
        sc.close();
    }
    public static void fibbo1(int n)
    {
        int a=0;
        int b=1;
        System.out.println(a+ " " +b);
        for(int i=2;i<n;i++)
        {
            int sum=a+b;
            System.out.println(" " +sum);
            a=b;
            b=sum;
        }
        System.out.println();
    }
}
