/*Given two integers N amd M. Make the two integers equal by doing minimum number of operations on N amd M
 The operations are: You can increment N by +1
 You can increment M by +2
 Input: 3 4 output: 1
 Input: 5 5 output: 0
 Input: 8 3 output: 4
 */
public class increment {
    public static void main(String[] args) {
        int n=8;
        int m=3;
        System.out.println(increment1(n,m));
    }
    public static int increment1(int n, int m)
    {
        int count=0;
        while(n!=m)
        {
            if(n==m)
            {
                return 0;
            }
            else if(n!=m && n<m)
            {
                n++;
                count++;
            }
            else if(n!=m && n>m)
            {
                m+=2;
                count++;
            }
        }
        return count;
    }
}
