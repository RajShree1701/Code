import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        int l[]={2,4,6,10,1};
        System.out.println(sum(l));
    }
    public static ArrayList<Integer> sum(int l[])
    {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<l.length;i++)
        {
            int  sum2=0;
            for(int j=0;j<l.length;j++)
            {
                if(l[j]>=l[i])
                {
                    sum2+=l[j];
                }
            }
           result.add(sum2);
        }
        return result;
    }
}
