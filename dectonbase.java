// import java.util.*;

public class dectonbase
{
    public static void main(String[] args) {
        int n=12;
        int nums=718;
        System.out.println(base(n,nums));
    }
    public static String base(int n,int nums)
    {
        String str="0123456789ABCDEF";
        StringBuilder result=new StringBuilder();
        while(nums>0)
        {
            int rem=nums%n;
            result.append(str.charAt(rem));
            nums=nums/n;
        }
        result.reverse();
        return String.valueOf(result);
    }
}