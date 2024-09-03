import java.util.*;
class secondsum {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(largesum(a,n));
        sc.close();
    }
    public static int largesum(int[]a,int n)
    {
        if(n<=3)
        {
           return 0;
        }
        ArrayList<Integer>even=new ArrayList<Integer>();
        ArrayList<Integer>odd=new ArrayList<Integer>();
        even.add(a[0]);
        for(int i=1;i<a.length;i++)
        {
            if(i%2==0)
            {
                even.add(a[i]);
            }
            else
            {
                odd.add(a[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        return even.get(even.size()-2)+odd.get(odd.size()-2);
    }
}
