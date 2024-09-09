// public class binarysearch {
//     public static void main(String ars[])
//     {
//         int a[]={1,2,3,4};
//         int n=3;
//         System.out.println(binary(a,n));
//     }
//     public static int binary(int a[],int n)
//     {
//         int left=0;
//         int right=a.length-1;
//         int mid;
//         while(left<right)
//         {
//             mid=(left+right)/2;
//             System.out.println(mid);
//             if(a[mid]==n)
//             {
//                 return mid; //return the index of the value
//             }
//             if(a[mid]<n)
//             {
//                 left=mid+1;
//             }
//             else
//             {
//                 right=mid-1;
//             }
//         }
//         return -1;
//     }
// }


public class binarysearch
{
    public static void main(String ars[])
    {
          int a[]={1,2,3,4};
         int n=3;
        System.out.println(binary(a,n));
    }
    public static int binary(int a[],int n)
    {
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(a[mid]==n)
            {
                return mid;
            }
            else if(a[mid]<n)
            {
                left=mid+1;
            }
            else if(a[mid]>n)
            {
                right=mid-1;
            }
        }
        return 0;
    }
}