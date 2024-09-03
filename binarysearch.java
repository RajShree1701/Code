public class binarysearch {
    public static void main(String ars[])
    {
        int a[]={2,4,7,9,12,13,15,16};
        int n=15;
        System.out.println(binary(a,n));
    }
    public static int binary(int a[],int n)
    {
        int left=0;
        int right=a.length-1;
        int mid;
        while(left<right)
        {
            mid=(left+right)/2;
            if(a[mid]==n)
            {
                return mid; //return the index of the value
            }
            if(a[mid]<n)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}