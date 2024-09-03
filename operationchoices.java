import java.util.*;
public class operationchoices {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(operation(a,b,c));
        sc.close();
    }
    public static int operation(int a,int b, int c)
    {
        if(c==1)
        {
            return a+b;
        }
        else if(c==2)
        {
            return a-b;
        }
        else if(c==3)
        {
            return a*b;
        }
        else if(c==4)
        {
            return a/b;
        }
        return 0;
    }
}
