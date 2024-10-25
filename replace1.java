/* input= dipakshi 
 output= dipakohi ( replace s with o)
*/
// public class replace1 {
//     public static void main(String[] args) {
//         String str="dipakshi";
//         char s1='o';
//         System.out.println(replacee(str,s1));
//     }
//     public static String replacee(String str,char s1)
//     {
//        char[] charArray=str.toCharArray();
//         for(int i=0;i<charArray.length;i++)
//         {
//             if(charArray[i]=='s')
//             {
//                 charArray[i]=s1;
//             }
//         }
//         return new String(charArray);
//     }
// }


/*
 replace j in rajshree with m */

 public class replace1
 {
    public static void main(String[] args) {
        String str="rajshree";
        char s1='m';
        System.out.println(replacee(str,s1));
    }
    public static String replacee(String str,char s1)
    {
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]=='j')
            {
                charArray[i]=s1;
            }
        }
        return new String(charArray);
    }
 }