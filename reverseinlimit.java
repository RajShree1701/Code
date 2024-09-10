import java.util.ArrayList;

public class reverseinlimit
{
    public static void main(String[] args) {
        int n=10;
        int m=80;
        System.out.println(reverselimit(n,m));
    }
    public static  ArrayList<Integer> reverselimit(int n,int m)
    {
        ArrayList<Integer> palindrome=new ArrayList<>();
        for(int i=n;i<=m;i++)
        {
            int temp=i;
            int s=i;
            int rev=0;
            while(s!=0)
            {
                int rem=s%10;
                rev=rev*10+rem;
                s=s/10;
            }
            if(temp==rev)
            {
                palindrome.add(rev);
            }
        }
        return palindrome;
    }
}