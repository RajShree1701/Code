/*Input - Hello World
Output - hELLO wORLD */
// public class upperandlowercase {
//     public static void main(String[] args) {
//         String str="Hello World";
//         System.out.println(casechange(str));
//     }
//     public static String casechange(String str)
//     {
//         StringBuilder change=new StringBuilder();
//         for(int i=0;i<str.length();i++)
//         {
//             if(str.charAt(i)>='a' && str.charAt(i)<='z')
//             {
//                 change.append((char)(str.charAt(i)-32));
//             }
//             else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
//             {
//                 change.append((char)(str.charAt(i)+32));
//             }
//             else
//             {
//                 change.append(str.charAt(i));
//             }
//         }
//         return change.toString();
//     }
// }


//other method
// public class upperandlowercase
// {
//     public static void main(String[] args) {
//         String str="Hello World";
//         System.out.println(casechange(str));
//     }
//     public static String casechange(String str)
//     {
//         StringBuilder change=new StringBuilder();
//         for(int i=0;i<str.length();i++)
//         {
//             if(Character.isLowerCase(str.charAt(i)))
//             {
//                 change.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else if (Character.isUpperCase(str.charAt(i))) 
//             {
//                 change.append(Character.toLowerCase(str.charAt(i)));
//             }
//             else
//             {
//                 change.append(str.charAt(i));
//             }
//         }
//         return change.toString();
//     }
// }



// for removing white space
public class upperandlowercase
{
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(casechange(str));
    }
    public static String casechange(String str)
    {
        StringBuilder change=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isWhitespace(str.charAt(i)))     /// or we use if(str.charAt(i) != ' ') this is for without using whitespace function
            {
                if(Character.isLowerCase(str.charAt(i)))
                {
                    change.append(Character.toUpperCase(str.charAt(i)));
                }
                else if(Character.isUpperCase(str.charAt(i)))
                {
                    change.append(Character.toLowerCase(str.charAt(i)));
                }
                else
                {
                    change.append(str.charAt(i));
                }
            }
        }
        return change.toString();
    }
}