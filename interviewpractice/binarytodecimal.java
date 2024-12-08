package interviewpractice;

public class binarytodecimal {
    public static void main(String[] args) {
        int binary=1010;
        int decimal=0;
        int base=1;
        while(binary>0)
        {
            int lastdigit=binary%10;
            decimal+=lastdigit*base;
            base=base*2;
            binary=binary/10;
        }
        System.out.println(decimal);
    }
}
