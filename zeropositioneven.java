import java.util.ArrayList;
import java.util.Collections;

public class zeropositioneven {
    public static void main(String[] args) {
        int a[]={2,1,3,4,4,9,6,7,8};
        System.out.println(zeroeven(a));
    }
    public static int zeroeven(int b[])
    {
        int n=b.length;
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        if(n<=3)
        {
            return 0;
        }
        even.add(b[0]);
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                even.add(b[i]);
            }
            else
            {
                odd.add(b[i]);
            }
        }
        Collections.sort(even);
        Collections.reverse(odd);
        System.out.println(even);
        System.out.println(odd);
        return even.get(even.size()-2)+odd.get(odd.size()-2);// add of second largers in even and second smallest in odd
    }
}
