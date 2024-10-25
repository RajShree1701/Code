public class bigbasket {
    public static void main(String[] args) {
        // int a=8;
        // int m=4;
        // int rs=6;

        int a=4;
        int m=7;
        int rs=6;
        System.out.println(bigbasket1(a,m,rs));
    }
    public static int bigbasket1(int a,int m,int rs)
    {
        int s=0,s1=0,s2=0;
        if(a>=m)
        {
            s=a-m;
            s1=s*1;
            s2=rs-s1;
        }
        else if(a<=m)
        {
            s=m-a;
            s1=s*1;
            s2=rs+s1;
        }
        return s2;
    }
}
