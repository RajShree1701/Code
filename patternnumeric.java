/* 1
   22
   333
   4444
   55555    draw this pattern
 */
// public class patternnumeric {
//     public static void main(String[] args) {
//         int s=5;
//         for(int i=1;i<=s;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }


//reverse of this pattern

// public class patternnumeric
// {
//   public static void main(String[] args) {
//     int s=5;
//     for(int i=s;i>=1;i--)
//     {
//       for(int j=1;j<=i;j++)
//       {
//         System.out.print(i);
//       }
//       System.out.println();
//     }
//   }
// }

/* 
           1
          22
         333
        4444
       55555   
 */

public class patternnumeric
{
  public static void main(String[] args) 
  {
    int s=5;
    for(int i=1;i<=s;i++)
    {
      for(int j=1;j<=s-i;j++)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
 }
} 