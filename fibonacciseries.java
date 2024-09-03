import java.util.*;
public class fibonacciseries {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+ " " +b);
        int sum;
        for(int i=2;i<n;i++)
        {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
        sc.close();
    }
}
