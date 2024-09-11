import java.util.ArrayList;

public class reversesum {
    public static void main(String[] args) {
        int a[]={4,5,6,7,8,9,2,1,4,5};
        System.out.println(revsum(a));
    }
    public static int revsum(int a[])
    {
        int n=a.length;
        int sum=0;
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            even.add(a[i]);
        }
        for(int j=0;j<even.size();j++)
        {
            if(j%2==0)
            {
                sum+=even.get(j);
            }
        }
        return sum;
    }
}
