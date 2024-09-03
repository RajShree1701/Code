// import java.util.*;
// class sumcarries {
//     public static void main(String ars[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         int c=0;
//         int rem=0;
//         while(n1!=0 && n2!=0)
//         {
//             int d1=n1%10,d2=n2%10;
//             if((d1+d2+rem)>9)
//             {
//                 c++;
//                 int s=d1+d2+rem;
//                 s=s/10;
//                 rem=s;
//             }
//             n1=n1/10;
//             n2=n2/10;
//         }
//         while(n1!=0)
//         {
//             int d1=n1%10;
//             if((d1+rem)>9)
//             {
//                 c++;
//                 int s=d1+rem;
//                 s=s/10;
//                 rem=s;
//             }
//             n1=n1/10;
//         }
//         while(n2!=0)
//         {
//             int d2=n2%10;
//             if((d2+rem)>9)
//             {
//                 c++;
//                 int s=d2+rem;
//                 s=s/10;
//                 rem=s;
//             }
//             n2=n2/10;
//         }
//         System.out.println(c);
//         sc.close();
//     }
// }

class AddCarry {

    public static int addCarry(int num1, int num2) {
        int total = num1 + num2;
        int carry = 0;
        
        // Loop while there are digits left in the sum
        while (total > 0) {
            int listDigit = total % 10;  // Extract the last digit of the sum
            int listdigit1 = num1 % 10;  // Extract the last digit of num1
            
            // If the digit from the sum is less than the corresponding digit of num1, increment carry
            if (listDigit < listdigit1) {
                carry++;
            }

            total = total / 10;  // Remove the last digit from the sum
            num1 = num1 / 10;    // Remove the last digit from num1
        }
        
        return carry;
    }

    public static void main(String[] args) {
        System.out.println(addCarry(451, 349));  // Testing the function
    }
}
