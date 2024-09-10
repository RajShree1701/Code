public class testsubstring {
    public static void main(String[] args) {
        String word="bluabcsnder";
        String substringg1="uabcsrteyuh";
        String longest="";
        for(int j=0;j<word.length();j++)
        {
            for(int k=j+1;k<=word.length();k++)
            {
                String substringg=substringg1.substring(j,k);
                if(word.contains(substringg) && substringg.length()>longest.length())
                {
                    longest=substringg;
                }
            }
        }
        System.out.println(longest);
    }
}
