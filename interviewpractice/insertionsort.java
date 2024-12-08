package interviewpractice;

public class insertionsort {
    public static void main(String[] args) {
        int a[]={6,5,1,2,3};
        int sorted[]=insertion(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(sorted[i]+" ");
        }
    }
    public static int[] insertion(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int current=a[i];
            int j=i-1;
            while(j>=0 && current<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
        return a;
    }
}
