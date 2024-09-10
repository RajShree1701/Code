public class substring {

    // Function to find the longest common substring
    public static void main(String[] args) {
        String input1="thundddder";
        String input2[]={"thunder","under","blundddder"};
        int n=input2.length;
        System.out.println(substring1(input1,input2,n));
    }
    public static String substring1(String input1,String input2[],int n)
    {
        String longest="";
        for(int i=0;i<n;i++)
        {
            String word=input2[i];
            if(input1.equals(input2[i]))
            {
                continue;
            }
            for(int j=0;j<input1.length();j++)
            {
                for(int k=j+1;k<=input1.length();k++)
                {
                    String substringg=input1.substring(j,k);
                    if(word.contains(substringg) && substringg.length()>longest.length())
                    {
                        longest=substringg;
                    }
                }
            }
        }
        return longest;
    }
}