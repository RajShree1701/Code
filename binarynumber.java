import java.util.*;
class binarynumber {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str == null)
        {
            System.out.println(-1);
        }
        int res=str.charAt(0)-'0';
        for(int i=1;i<str.length();)
        {
            char prev=str.charAt(i);
            i++;
            if(prev == 'A')
            {
               res=res&(str.charAt(i)-'0');
            }
            else if(prev == 'B')
            {
                res=res|(str.charAt(i)-'0');
            }
            else
            {
                res=res^(str.charAt(i)-'0');
            }
            i++;
        }
        System.out.println(res);
        sc.close();
    }
}
