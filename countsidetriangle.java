public class countsidetriangle {
    public static void main(String[] args) {
        int s=5;
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=s-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
