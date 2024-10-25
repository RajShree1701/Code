public class palindromestring {
    public static void main(String[] args) {
       // String str="nitin";
        String str="hello";
        System.out.println(palindromestr(str));
    }
    public static boolean palindromestr(String str)
    {
        String s="";
        String original=str;
        for(int i=0;i<str.length();i++)
        {
            s=str.charAt(i)+s;
        }
        if(original.equals(s))
        {
            return true;
        }
        return false;
    }
}
