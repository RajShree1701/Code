// import java.util.*;
// public class linearsearch {
//     public static void main(String ars[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         int x=sc.nextInt();
//         for(int j=0;j<n;j++)
//         {
//             if(x==a[j])
//             {
//                 System.out.println("Found" +" "+ x);
//                 break;
//             }
//             // else
//             // {
//             //     System.out.println("Not found");
//             //     break;
//             // }
//         }
//         for(int k=0;k<n;k++)
//         {
//             if(x!=a[k])
//             {
//                 System.out.println("not found");
//                 break;
//             }
//         }
//         sc.close();
//     }
// }

import java.util.*;
public class linearsearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int flag = 0;
        for(int j=0;j<n;j++)
        {
            if(x==a[j])
            {
                System.out.println("Found" +" "+ x);
                flag = 1;
                break;

            }
        }
        if(flag == 0){
            System.out.println("Not Found " );
        }
        sc.close();
    }
}