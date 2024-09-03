// it is code for printing the even position value in a array;
// ex: in an array 2 3 4 1 5 is present the output is 3 1 because 3 and 1 is present at the even postion index.
//3 is present at 2nd index of array and 1 is present at 4th index of array.
import java.util.*;
class evenposition {
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
        for(int k=1;k<a.length;k=k+2)//print a number which is at even position
        {
            System.out.print(a[k] +" ");
        }
        sc.close();
    }
}
