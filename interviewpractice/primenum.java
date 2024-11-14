package interviewpractice;
import java.util.Scanner;
public class primenum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primenum1(n);
        sc.close();
    }
    public static void primenum1(int n)
    { 
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i + " ");
            }
        }
    }
}