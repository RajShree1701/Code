import java.util.*;
public class lasttwosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum1=arr[n-1]+arr[n-2];
        System.out.println(sum1);
        sc.close();
    }
}
