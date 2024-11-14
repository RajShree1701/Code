import java.util.Scanner;

public class mininrarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(minimum(n,a));
        sc.close();
    }
    public static int minimum(int n,int a[])
    {
       int min1=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min1)
            {
                min1=a[i];
            }
        }
        return min1;
    }
}
