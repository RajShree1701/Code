import java.util.*;
public class calculate3and5 {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(calculate(m,n));
        sc.close();
    }
    public static int calculate(int m,int n)
    {
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
