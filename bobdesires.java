import java.util.*;
public class bobdesires {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int m=sc.nextInt();
        System.out.println(bob(n,a,m));
        sc.close();
    }
    public static int bob(int n, int a[], int m)
    {
        int count=0;
        int i;
        for(i=0;i<n;i++)
        {
            if(a[i]%5==0)
            {
                count++;
            }
            else if(a[i]<=m)
            {
                m=m-a[i];
                count++;
            }
        }
        return count;
    }
}

