import java.util.*;
public class lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int s1=lowercasecount(s);
        System.out.println(s+ ":" +s1);
        sc.close();
    }
    public static int lowercasecount(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                count++;
            }
        }
        return count;
    }
}
