import java.util.*;
class pattern {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<n;k++)
            {
                System.out.print("* ");
            }  
            System.out.println();
        }
        sc.close();
    }
}
