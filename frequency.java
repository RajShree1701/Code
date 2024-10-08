import java.util.*;
class frequency {
   public static void main(String ars[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       { 
           a[i]=sc.nextInt();         
       }
       int c=0;
       for(int j=0;j<n-1;j++)
       {
          if(a[j]==a[j+1])
          {
              c++;
          }
        //   System.out.println(c);
       }
       System.out.println(c);
       sc.close();
   } 
}
