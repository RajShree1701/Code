/*
 Given two strings s and t, return true if t is an 
anagram
 of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */
package LEETCODE;
import java.util.Arrays;
public class validanagram242 {
    public static void main(String[] args) {
        //String s="anagram";
        //String t="nagrama";
        String s="car";
        String t="rat";
        System.out.println(validana(s,t));
    }
    public static boolean validana(String s, String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}
