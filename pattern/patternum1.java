package pattern;
public class patternum1 {
    public static void main(String[] args) {
        int n=5;
       for(int i=0;i<n;i++)
       {
         for(int j=i;j<=n-1;j++)
         {
            System.out.print(j+1);
         }
         System.out.println();
       }
    }
}