//first sum the no. of digit and then reverse the digit;
//ex: 75 output: 21 explanation: 7+5=12 then reverse 21
public class sumreverse {
    public static void main(String[] args) {
        int n=75;
        System.out.println(sumrev(n));
    }
    public static int sumrev(int n)
    {
        int sum=0;
        while(n>0)
        {
            int sum1=n%10;
            sum+=sum1;
            n=n/10;
        }
        int rev=0;
        while(sum>0)
        {
            int rem=sum%10;
            rev=rev*10+rem;
            sum=sum/10;
        }
        return rev;
    }
}
