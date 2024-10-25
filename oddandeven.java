import java.util.*;
public class oddandeven {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(oddeven1(n, a));
        sc.close();
    }
    public static String oddeven1(int n, int a[])
    {
        int i;
        String result="";
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                result=result+"even ";
                
            }
            else
            {
                result=result+"odd ";
            }
        }
        return result;
    }
}
