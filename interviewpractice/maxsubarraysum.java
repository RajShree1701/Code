package interviewpractice;

public class maxsubarraysum {
    public static void main(String ars[])
    {
        int num[]={-2,1,-3,4,-1,2,1,-5,4};
        //int num[]={5,4,-1,7,8};
        //int num[]={1};
        int sum=0;
        int maxsum=num[0];
        for(int i=0;i<num.length;i++)
        {
            sum+=num[i];
            if(sum>maxsum)
            {
                maxsum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(maxsum);
    }
}
