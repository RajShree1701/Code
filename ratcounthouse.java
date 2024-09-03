import java.util.*;
class ratcounthouse {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=unit*r;
        int s1=0;
        int c=0;
        for(int j=0;j<n;j++)
        {
            s1=s1+a[j];
            c++;
            if(s1>=s)
            {
                System.out.println(c);
                break;
            }
        }
        if(s1<s)
        {
            System.out.println(0);
        }
        sc.close();
    }
}
