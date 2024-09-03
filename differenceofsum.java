import java.util.*;
public class differenceofsum {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0,sum1=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
               sum=sum+i;
            }
            else
            {
                sum1=sum1+i;
            }
        }
        System.out.println(sum1-sum);
        sc.close();
    }
}
