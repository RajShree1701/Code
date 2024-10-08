import java.util.ArrayList;

public class earthandmars {
    public static void main(String[] args) {
        int m=14;
        int n=4;
        int w[]={1,3,10,14};
        System.out.println(earthmars(m,n,w));
    }
    public static int earthmars(int m,int n,int w[])
    {
        ArrayList<Integer> bagsize=new ArrayList<>();
        for(int i=1;i<=m;i++)
        {
            bagsize.add(i);
        }
        for(int i=0;i<bagsize.size();i++)
        {
            for(int j=0;j<n;j++)
            {
                bagsize.remove(Integer.valueOf(w[j]));
            }
        }
        int max=0;
        for(int i=0;i<bagsize.size();i++)
        {
            int sum=bagsize.get(i);int count=0;
            for(int j=i+1;j<bagsize.size();j++)
            {
                if(sum<=m)
                {
                    sum+=bagsize.get(j);
                    count++;
                }
                if(max<count)
                {
                    max=count;
                }
            }
        }
        return max;
    }
}
