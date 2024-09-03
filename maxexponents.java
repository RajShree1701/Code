import java.util.*;
public class maxexponents {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int a=7;
        int b=12;
        System.out.println(maxexpo(a,b));
        sc.close();
    }
    public static int maxexpo(int a, int b)
    {
        int maxnum=a;
        int maxexpo=0;
        for(int i=a;i<=b;i++)
        {
            int num=i;
            int expo=0;
            while(num%2==0)
            {
                num=num/2;
                expo++;
            }
            if(maxexpo<=expo)
            {
                maxexpo=expo;
                maxnum=i;
            }
        }
        return maxnum;
    }
}
