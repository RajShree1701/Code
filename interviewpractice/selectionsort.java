package interviewpractice;

public class selectionsort {
    public static void main(String[] args) {
        int a[]={7,6,3,4,2,1};
        int sortedArray[] = selection(a);
        System.out.println("Sorted array:");
        for(int i=0; i<sortedArray.length; i++) 
        {
            System.out.print(sortedArray[i] + " ");
        }  
    }
    public static int[] selection(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[smallest]>a[j])
                {
                    smallest=j;
                }
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;

        }
        return a;
    }
}
