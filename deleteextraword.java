/*Delete Characters to Make Fancy String
Easy
Topics
Companies
Hint
A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
Example 2:

Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".
Example 3:

Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".*/

public class deleteextraword {
    public static void main(String[] args) {
        //String s="leeetcode";
        String s = "aaabaaaa";
        //String s = "aab";
        System.out.println(fancystring(s));
    }
    public static String fancystring(String s)
    {
        StringBuilder result=new StringBuilder();
        int count=1;
        result.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<3)
            {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
