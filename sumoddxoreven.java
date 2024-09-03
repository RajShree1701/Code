import java.util.*;
public class sumoddxoreven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(sumxor(n,a));
        sc.close();
    }
    public static int sumxor(int n,int a[])
    {
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even=even^a[i];
            }
            else
            {
                odd=odd+a[i];
            }
        }
        return odd-even;
    }
}
