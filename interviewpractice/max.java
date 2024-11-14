package interviewpractice;
import java.util.Scanner;
public class max 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(max1(n,a));
        sc.close();
    }
    public static int max1(int n,int a[])
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
}
