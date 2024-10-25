public class palindrome {
    public static void main(String[] args) {
       // int n=121;
        int n=123;
        System.out.println(palidromenum(n));
    }
    public static int palidromenum(int n)
    {
        int rev=0;
        int original=n;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==rev)
        {
            return 1;
        }
        return 0;
    }
}
