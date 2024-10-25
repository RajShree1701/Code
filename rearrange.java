/*You are given two strings, s and t . Your task is to determine if it's possible to rearrange the 
characters of s to form the string t .

Write	a	function	that	returns		True	it's	possible	to	create	t	
by rearranging the characters of s	and False otherwise.

Input
Two strings, s and t where the length of s and t are between 1 and 1000 characters.

Output
Return True if it's possible to create t by rearranging the characters of s and False otherwise

Example:
s="listen" t="silent"  this is called anagrams.
Output: True */

// import java.util.Arrays;
// public class rearrange 
// {
//    public static void main(String[] args) 
//    {
//       String s="listen";
//       String t="silent";
//       System.out.println(rearrange1(s,t));
//    } 
//    public static boolean rearrange1(String s,String t)
//    {
//         if (s.length()!=t.length()) 
//         {
//             return false;
//         }
//         char[] sArray = s.toCharArray();
//         System.out.println(sArray);
//         char[] tArray = t.toCharArray();
//         System.out.println(tArray);
//         Arrays.sort(sArray);
//         System.out.println(sArray);
//         Arrays.sort(tArray);
//         System.out.println(tArray);
//         return Arrays.equals(sArray,tArray);
//    }
// }

import java.util.Arrays;
public class rearrange 
{
   public static void main(String[] args) 
   {
      String s="listen";
      String t="silent";
      System.out.println(rearrange1(s,t));
   } 
   public static boolean rearrange1(String s,String t)
   {
        if (s.length()!=t.length()) 
        {
            return false;
        }
        char[] sArray = s.toCharArray();
        System.out.println(sArray);
        char[] tArray = t.toCharArray();
        System.out.println(tArray);
        Arrays.sort(sArray);
        System.out.println(sArray);
        Arrays.sort(tArray);
        System.out.println(tArray);
        if(Arrays.equals(sArray,tArray))
        {
            return true;
        }
        else
        {
            return false;
        }
   }
}
