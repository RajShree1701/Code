import java.util.Scanner;
class reverse {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=n-1;j>=0;j--)
        {
            System.out.print(a[j] +" ");
        }
        sc.close();
    }
}
