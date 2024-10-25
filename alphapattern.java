// public class alphapattern {
//     public static void main(String[] args) {
//         int s=5;
//         for(int i=1;i<=s;i++)
//         {
//             char alphabet='A';
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(alphabet+" ");
//                 alphabet++;
//             }
//             System.out.println();
//         }
//     }
// }


//reverse of this pattern

public class alphapattern
{
    public static void main(String[] args) {
        int s=5;
        for(int i=s;i>=1;i--)
        {
            char alpha='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(alpha+" ");
                alpha++;
            }
            System.out.println();
        }
    }
}