import java.util.*;
public class submatrices {
    public static void main(String ars[])
    {
        try (Scanner sc = new Scanner(System.in)) {
          int n=sc.nextInt();
          int a[]=new int[n];
          ArrayList<Integer>even=new ArrayList<>();
          ArrayList<Integer>odd=new ArrayList<>();
          int i;
          for(i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
              if(i%2==0)
              {
                even.add(a[i]);
              }
              else
              {
                odd.add(a[i]);
              }
          }
          Collections.sort(even);
          Collections.sort(odd);
          System.out.println(even);
          System.out.println(odd);
          int s1=(even.get(even.size()-2));
          int s2=(odd.get(odd.size()-2));
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s1+s2);
          sc.close();
        }
    }
}
