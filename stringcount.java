/*write a program to give the following output for the given input
input: a1b10  output: abbbbbbbbbb
input: b3c6d15 output: bbbccccccddddddddddddddd
the number varies from 1 to 99 
*/
public class stringcount {
   public static void main(String[] args) {
     String a="a1b10";
     System.out.println(count(a));
   } 
   public static String count(String a)
   {
      StringBuilder result=new StringBuilder();
      char currentchar=0;
      int num=0;
      for(int i=0;i<a.length();i++)
      {
         if(Character.isLetter(a.charAt(i)))
         {
            currentchar=a.charAt(i);
         }
         else if (Character.isDigit(a.charAt(i))) 
         {
             num=num*10+(a.charAt(i)-'0');
         }
         if(i+1==a.length() || !Character.isDigit(a.charAt(i+1)))
         {
            for(int j=0;j<num;j++)
            {
               result.append(currentchar);
            }
            num=0;
         }
      }
      return result.toString();
   }
}
