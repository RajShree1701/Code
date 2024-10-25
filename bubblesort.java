// import java.util.*;
// class bubblesort {
//     public static void main(String ars[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         int temp=0;
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         //Arrays.sort(a);
//         for(int k=0;k<n-1;k++)
//         {
//             for(int l=0;l<n-k-1;l++)
//             {
//                 if(a[l]>a[l+1])
//                 {
//                     temp=a[l];
//                     a[l]=a[l+1];
//                     a[l+1]=temp;
//                 }
//             }
//         }
//         for(int j=0;j<n;j++)
//         {
//             System.out.print(a[j]+" ");
//         }
//         sc.close();
//     }
// }


public class bubblesort
{
    public static void main(String ars[])
    {
        int a[]={4,5,6,7,8,9,1};
        int sortedArray[] = sort1(a);
        System.out.println("Sorted array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
    public static int[] sort1(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}