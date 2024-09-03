import java.util.*;
class copyarray {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int a1[]=new int[a.length];
        for(int j=0;j<a.length;j++)
        {
            a1[j]=a[j];
        }
        for (int k=0;k<a1.length;k++) {
            System.out.print(a1[k] + " ");
        }
        sc.close();
    } 
}
