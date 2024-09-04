class reversestringg
{
    public static void main(String[] args) {
        String s=" the sky is blue ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s=s.trim();
        String reverse1[]=s.split("\\s+");
        String str="";
        for(int i=reverse1.length-1;i>0;i--)
        {
            str+=reverse1[i];
            str+=" ";
        }
        str+=reverse1[0];
        return str;
    }
}
