
public class AddCarry
{
    public static void main(String[] args) {
        int n1=451;
        int n2=349;
        System.out.println(addcarry(n1,n2));
    }
    public static int addcarry(int n1,int n2)
    {
        int sum_total=n1+n2;
        int carry=0;
        while(sum_total>0)
        {
            int lastdigit=sum_total%10;
            int lastdigit1=n1%10;
            if(lastdigit<lastdigit1)
            {
                carry++;
            }
            sum_total=sum_total/10;
            n1=n1/10;
        }
        return carry;
    }
}
