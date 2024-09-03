import java.util.*;
class secondlargest {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         if(n<2)
         {
            System.out.println("INVALID");
         }
        Arrays.sort(a);
        for(int j=n-2;j>=0;j--)
        {
            if(a[j]!=a[n-1])
            {
                System.out.print(a[j] +" ");
                break;
            }           
        }
        sc.close();
    }
}
