public class maxindex {
    public static void main(String[] args) {
        int a[]={23,45,82,27,66,12,78,13,71,86};
        int n=a.length;
        System.out.println(maxindex1(a,n));
    }
    public static int maxindex1(int a[],int n)
    {
        int max=0;
        int i;
        for(i=0;i<n-1;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        return i;
    }
}
