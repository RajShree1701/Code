/* input: I am ram. output:= I_am_ram. */
public class replacespacewithunderscore {
   public static void main(String[] args) {
      String str="I am Ram";
      char s='-';
      System.out.println(replace2(str,s));
    } 
    public static String replace2(String str,char s)
    {
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]==' ')
            {
                charArray[i]=s;
            }
        }
        return new String(charArray);
    }
}
