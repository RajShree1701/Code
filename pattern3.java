// import java.util.*;
// class pattern3 {
//     public static void main(String ars[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int n1=2*n-2;
//         for(int i=n;i>0;i--)
//         {
//             for(int j=0;j<n-i;j++)
//             {
//                 System.out.print(" ");
//             }  
//             n1=n1-2;
//             for(int k=0;k<i;k++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

import java.util.*;
class pattern3 {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j >= i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
        sc.close();
    }
}
