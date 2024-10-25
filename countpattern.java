// public class countpattern {
//     public static void main(String[] args) {
//         int s=5;
//         for(int i=1;i<=s;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//reverse of this pattern
public class countpattern
{
    public static void main(String[] args) {
        int s=5;
        for(int i=s;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}