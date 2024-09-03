// import java.util.*;//krna h isko
// class passwordchecker {
//     public static void main(String ars[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         int n1=str.length();
//         int c=0;
//         int n=0;
//         if(n1<4)
//         {
//             System.out.println(0);
//         }
//         if(str.charAt(0)>=0 && str.charAt(0)<=9)
//         {
//             System.out.println(0);
//         }
//         for(int i=0;i<n1;i++)
//         {
//             if(str.charAt(i)>='A' && str.charAt(i)<='Z')
//             {
//                 c++;
//             }
//             if(str.charAt(i)>='0' && str.charAt(i)<='9')
//             {
//                 n++;
//             }
//             if(str.charAt(i)==' ' && str.charAt(i)=='/')
//             {
//                 System.out.println(0);
//             }
//         }
//         if(c>0 && n>0)
//         {
//             System.out.println(1);
//         }
//         else
//         {
//             System.out.println(0);
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// class passwordchecker
// {
//     public static void main(String ars[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         int n=str.length();
//         System.out.println(passwordchecker1());
//         sc.close();
//     }
//     public static int passwordchecker1(String str,int n)
//     {
//         if(n<4)
//         {
//             return 0;
//         }
//         if()
        
//     }
// }

// public class Main {
//     public static int CheckPassword(String str, int n) {
//         if (n < 4) {
//             return 0;
//         }

//         boolean Digit = false;
//         boolean Capital = false;

//         if (Character.isDigit(str.charAt(0))) {
//             return 0;
//         }

//         for (int i = 0; i < n; i++) {
//             char ch = str.charAt(i);

//             if (Character.isDigit(ch)) {
//                 Digit = true;
//             }

//             if (Character.isUpperCase(ch)) {
//                 Capital = true;
//             }

//             if (ch == ' ' || ch == '/') {
//                 return 0;
//             }
//         }

//         return Digit && Capital ? 1 : 0;
//     }

//     public static void main(String[] args) {
//         String password1 = "aA1_67";
//         int result1 = CheckPassword(password1, password1.length());
//         System.out.println("Output 1: " + result1);

//         String password2 = "a987 abC012";
//         int result2 = CheckPassword(password2, password2.length());
//         System.out.println("Output 2: " + result2);
//     }
// }