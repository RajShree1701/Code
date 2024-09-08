/*You have been given two strings A and B. You have to find the difference in the count of whitespaces in both the strings. Then you return a string even or odd along with the difference

Input Format:
input1: A string A
input2: A string B

Output Format:
Return a string mentioning the even or odd status of the difference and also the difference. 

Input 1:
He ll o Wo rl d
Hello World

Output 1:
Even:4*/
public class whitespacescount {
    public static void main(String[] args) {
        String s="He ll o wo rl d";
        String s1="Hello world";
        String[] result = whitespaces(s, s1);
        System.out.println("Result: " + result[0] + ", Count: " + result[1]);
       // System.out.println(whitespaces(s,s1));
    }
    public static String[] whitespaces(String s,String s1)
    {
        int i=s.length()-1;
        int j=s1.length()-1;
        int count=0;
        while(i>0)
        {
            if(s.charAt(i)!=s1.charAt(j))
            {
                count++;
                i--;
            }
            else
            {
                i--;
                j--;
            }
        }
        String result = (count % 2 == 0) ? "Even" : "Odd";
        return new String[]{result, String.valueOf(count)};
    }
}
