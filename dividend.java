// public class dividend {
//     public static void main(String[] args) {
//         int a[]={47,56,29,10};
//         int divisor=10;
//         int quotient=5;
//         int remainder=7;
//         int n=a.length;
//         System.out.println(dividend2(a,divisor,quotient,remainder,n));
//     }
//     public static int dividend2(int a[],int divisor,int quotient,int remainder,int n)
//     {
//         int max=0;
//         for(int i=0;i<n;i++)
//         {
//             if(a[i]>max)
//             {
//                 max=a[i];
//             }
//         }
//         System.out.println(max);
//         int dividend1=divisor*quotient+remainder;
//         for(int j=0;j<n;j++)
//         {
//             if(dividend1==a[j])
//             {
//                 return j;
//             }
//         }
//         return -1;
//     }
// }



// public class dividend {
//     public static void main(String[] args) {
//         int a[]={47,56,29,10};
//         int divisor=10;
//         int quotient=5;
//         int remainder=7;
//         int n=a.length;
//         int max=0;
//         for(int i=0;i<n;i++)
//         {
//             if(a[i]>max)
//             {
//                 max=a[i];
//             }
//         }
//         System.out.println(max);
//         int dividend1=divisor*quotient+remainder;
//         for(int j=0;j<n;j++)
//         {
//             if(dividend1==a[j])
//             {
//                 System.out.println(j);
//                 break;
//             }
//             else 
//             {
//                 System.out.println(-1);
//                 break;
//             }
//         }
//     }
// }



public class dividend {
    public static void main(String[] args) {
        int a[]={47,56,29,10};
        int divisor=10;
        int quotient=5;
        int remainder=7;
        int n=a.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        int dividend1=divisor*quotient+remainder;
        int index=-1;
        for(int j=0;j<n;j++)
        {
            if(dividend1==a[j])
            {
                index=j;
                break;
            }
        }
        if(index!=-1)
        {
            System.out.println(index);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
