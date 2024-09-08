import java.util.Arrays;

public class arrraypairs {
    public static void main(String[] args) {
        int a[]={11,9,13,10,8,7,4,12};
        int sum=18;
        pair(a,sum);
        //System.out.println(pair(a,sum));
    }
    public static void pair(int a[],int sum)
    {
        int i,j;
        Arrays.sort(a);
        int max=0;
        int x=0,y=0;
        for(i=a.length-1;i>1;i--)
        {
            for(j=0;j<i;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    if(max<a[i]*a[j])
                    {
                        x=a[i];
                        y=a[j];
                        max=a[i]*a[j];
                    }
                }
            }
        }
        System.out.println(x+ " " +y);
    }
}
