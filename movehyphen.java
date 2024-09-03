import java.util.*;
class movehyphen {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(move(str,str.length()));
        sc.close();
    }
    public static String move(String str,int n)
    {
        String str1="";
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='-')
            {
                str1=str.charAt(i)+str1;
            }
            else
            {
                str1=str1+str.charAt(i);
            }
        }
        return str1;
    }
}
