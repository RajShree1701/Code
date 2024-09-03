import java.util.*;//isko krna h sahi se kaam nhi kr rha
class bubblesort {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //Arrays.sort(a);
        for(int k=0;k<n;k++)
        {
            for(int l=k+1;k<n;k++)
            {
                if(a[k]>a[l])
                {
                    temp=a[k];
                    a[k]=a[l];
                    a[l]=temp;
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]);
        }
        sc.close();
    }
}
