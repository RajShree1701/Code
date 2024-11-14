public class twoarraymax {
    public static void main(String[] args) {
        int a[]={7,4,5,1,8,9};
        int a1[]={5,7,9,3,2,11};
        System.out.println(maxarray(a,a1));
     }
     public static int  maxarray(int a[],int a1[])
     {
        int max1=0;
        int max2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=max1) 
            {
                max1=a[i];
            }
        } 
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]>=max2) 
            {
                max2=a1 [i];
            }
        }
        if(max1>=max2)
        {
            return max1;
        }
        else
        {
            return max2;
        }
     }
}
