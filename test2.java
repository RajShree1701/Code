public class test2 {
    public static void main(String[] args) {
        String s[]={"geeksforgeeks", "geeks", "geek", "geezer"};
        String s1="";
        String str="";
        for(int i=0;i<s.length-1;i++)
        {
            String s2="";
            s1=s[i];
            s2=s[i+1];
            str="";
            int s3=Math.min(s1.length(),s2.length());
            for(int j=0;j<s3;j++)
            {
                if(s1.charAt(j)==s2.charAt(j))
                {
                    str+=s1.charAt(j);
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(str);
    }
}
