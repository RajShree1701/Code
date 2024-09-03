import java.util.*;
class arraylist {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a1=new ArrayList<Integer>(n);
        ArrayList<Integer>a2=new ArrayList<Integer>();
        System.out.println(a1);
        System.out.println(a2);
        for(int j=1;j<=n;j++)
        {
            a1.add(j);
            a2.add(j);
        }
        System.out.println(a1);
        System.out.println(a2);
        sc.close();
    }
}
