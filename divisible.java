import java.util.*;
class divisible {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        int sum1=0;
        for(int i=1;i<=m;i++)
        {
            if(i%n==0)
            {
                sum=sum+i;
            }
            else
            {
                sum1=sum1+i;
            }
        }
        int diff=sum1-sum;
        System.out.println(diff);
        sc.close();
    }
}
