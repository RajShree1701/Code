public class countvowels {
    public static void main(String[] args) {
        String str="codechef";
        int count=0;
        int i=0;
        while(i<str.length())
        {
            int c=str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
