package interviewpractice;

public class decimaltobinay {
    public static void main(String[] args) {
        int n=17;
        // String str=Integer.toBinaryString(n);// using built function 
        // System.out.println(str);
        //without using built function
        int num=n;
        String binary="";
        while(num>0)
        {
            int rem=num%2;
            binary=rem+binary;
            num=num/2;
        }
        if(binary.isEmpty())
        {
            binary="0";
        }
        System.out.println(binary);
    }
}
