import java.util.*;
class productsmallestpair {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(productsmallest(size,arr,sum));
        sc.close();
    }
    public static int productsmallest(int size, int arr[], int sum)
    {
        if(size<2)
        {
            return -1;
        }
        Arrays.sort(arr);
        int sum1;
        sum1=arr[0]+arr[1];
        if(sum1<=sum)
        {
             return arr[0]*arr[1];
        }
        else
        {
            return 0;
        }
    }
}
