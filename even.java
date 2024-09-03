import java.util.*;
class even
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int e[]=new int[a.length];
        for(int j=0;j<a.length;j++)
        {
            if(a[j]%2==0)
            {
                e[j]=a[j];
            }
            // else
            // {
            //     o[j]=a[j];
            // }
        }
        for(int k=0;k<e.length;k++)
        {
            System.out.println(e[k]);
        }
        int o[]=new int[a.length];
        for(int m=0;m<a.length;m++)
        {
            if(a[m]%2!=0)
            {
                o[m]=a[m];
            }
        }
        for(int l=0;l<o.length;l++)
        {
            System.out.print(o[l]);
        }
        sc.close();
    }   
}
