// it is code for printing the odd position value in a array;
// ex: in an array 2 3 4 1 5 is present the output is 2 4 5 because 2 and 4 and 5 is present at the odd postion index.
//2 is present at 1st index of array and 4 is present at 3rd index of array and 5 is present at 5th index of the array.
import java.util.*;
class oddposition {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)//print even number
        {
            if(a[j]%2==0)
            {
                System.out.print(a[j] +" ");
            }
        }
        System.out.println(" ");
        for(int k=0;k<a.length;k=k+2)//print a number which is at odd position
        {
            System.out.print(a[k] +" ");
        }
        sc.close();
    }
}
