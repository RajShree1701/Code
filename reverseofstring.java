// public class reverseofstring {
//     public static void main(String[] args) {
//         String s="RAJ";
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             System.out.print(s.charAt(i));
//         }
//     }
// }


public class reverseofstring
{
    public static void main(String[] args) {
        String s="RAJ";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            s1=s.charAt(i)+s1;
        }
        System.out.println(s1);
    }
}