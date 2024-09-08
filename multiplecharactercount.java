public class multiplecharactercount {
    public static void main(String[] args) {
        // String s="bbbbddddrrrrrtttttyyyyyy";
        String s="a";
        System.out.println(count1(s));
    }
    public static String count1(String s)
    {
        String s1="";
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else 
            {
                s1+=s.charAt(i)+Integer.toString(count);  
                count = 1;  
            }
        }
        s1 += s.charAt(s.length()-1)+Integer.toString(count);
        return s1;
    }
}
