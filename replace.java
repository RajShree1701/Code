import java.util.*;
class replace {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        a[1]=5;
       // System.out.println(a[1]);
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j] +" ");
        }
        sc.close();
    }
}
