import java.util.*;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(sumarray(n,a));
        sc.close();
    }
    public static int sumarray(int n,int a[])
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }
        return sum;
    }
}
