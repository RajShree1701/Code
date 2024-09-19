public class autobiographical
{
    public static void main(String[] args) {
        String s="HTHHTTHTHHHT";
        System.out.println(autonumbers(s));
    }
    public static int autonumbers(String s)
    {
        int s1=0;
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='H')
            {
                s1+=2;
                count++;
            }
            else 
            {
                s1-=1;
                count=0;
            }
            if(count==3)
            {
                break;
            }
        }
        return s1;
    }
}