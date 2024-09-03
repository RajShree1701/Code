import java.util.*;
class replace_a_to_p {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char s=sc.nextLine().charAt(0);
        char s1=sc.nextLine().charAt(0);
        System.out.println(replacee(str,s,s1));
        sc.close();
    }
    public static String replacee(String str,char s,char s1)
    {
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]==s)
            {
               charArray[i]=s1;
            }
            else if(charArray[i]==s1)
            {
                charArray[i]=s;
            }
        }
        return new String(charArray);
    }
}
