package interviewpractice;

import java.util.Scanner;

// public class perfectnum {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(perfectnum1(n));
//         sc.close();
//     }
//     public static boolean perfectnum1(int n)
//     {
//         int i=1;
//         int sum=0;
//         while(i<=n/2)
//         {
//             if(n%i==0)
//             {
//                 sum+=i;
//             }
//             i++;
//         }
//         return sum==n;
//     }
// }

public class perfectnum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println("Perfect no.");
        }
        else
        {
            System.out.println("Not perfect no.");
        }
        sc.close();
    }
}