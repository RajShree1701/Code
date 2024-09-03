import java.util.*;
class primenumber
{
  public static void main(String ars[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=2;
    while(c<n)
    {
      if(n%c==0)
      {
        System.out.println("Not prime");
        break;
      }
      c=c+1;
    }
    System.out.println("Prime");
    sc.close();
  }
}