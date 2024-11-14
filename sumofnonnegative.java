//find the average of non negative number
public class sumofnonnegative {
    public static void main(String[] args) {
        int a[]={-3,-2,0,-7,25,12,-11};
        System.out.println(nonnegativesum(a));
    }
    public static float nonnegativesum(int a[])
    {
        float sum=0;
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                sum+=a[i];
                c++;
                sum/=c;
            }

        }
        return sum;
    }
}
