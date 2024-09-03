public class test1{
    public static void main(String[] args) {
        int n=7;
        int m=12;
        System.out.println(maxexpo(n,m));
    }
    public static int maxexpo(int n,int m)
    {
        int num;int maxexpo=0;int maxnum=0;
        for(int i=n;i<=m;i++)
        {
            num=i;int count=0;
            while(num%2==0)
            {
                num=num/2;
                count++;
            }
            if(count>maxexpo)
            {
                maxexpo=count;
                maxnum=i;
            }
        }
        return maxnum;
    }
} 

