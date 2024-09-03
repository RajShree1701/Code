import java.util.*;
public class countarraay {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        int secmax=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(max<a[i])
            {
                secmax=max;
                max=a[i];
            }
            else if(secmax<a[i] && max>a[i])
            {
                secmax=a[i];
            }
        }
        for(int j=0;j<n;j++)
        {
            if(a[j]==secmax)
            {
                c++;
            }
        }
        System.out.println(secmax);
        System.out.println(c);
        sc.close();
    }
}
