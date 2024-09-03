import java.util.*;
class findcount {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int diff=sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(Math.abs(a[j]-num)<diff)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
