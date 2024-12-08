package interviewpractice;

public class quicksort {
    public static void main(String[] args) {
        int a[]={6,3,9,5,2,8};
        int n=a.length;

        quicksort1(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort1(int a[],int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(a,low,high);

            quicksort1(a,low,pivot-1);
            quicksort1(a,pivot+1,high);
        }
    }
    public static int partition(int a[],int low,int high)
    {
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                //swap
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        return i;
    }
}
