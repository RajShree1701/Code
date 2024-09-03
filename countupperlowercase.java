import java.util.*;
class countupperlowercase 
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        int c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                c++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                c1++;
            }
        }
        System.out.println("Upper:" +c);
        System.out.println("Lower:" +c1);
        sc.close();
    }
}
