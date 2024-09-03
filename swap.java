//swap of two number using 3rd variable
// import java.util.*;
// class swap {
//     public static void main(String ars[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int n1=sc.nextInt();
//         int temp=n;
//         n=n1;
//         n1=temp;
//         System.out.println(n +" "+ n1);
//         sc.close();
//     }
// }

//swap of two number without using third variable
import java.util.*;
class swap
{
   public static void main(String ars[])
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      n=n+n1;
      n1=n-n1;
      n=n-n1;
      System.out.println(n +" "+ n1);
      sc.close();
   }
}
