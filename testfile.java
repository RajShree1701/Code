// public class testfile {
//     public static void main(String[] args) {
//         int a[]={1,1,1,1,2,2,2,2,2,2,3,4,5};
//         System.out.println(countarray(a));
//     }
//     public static int countarray(int a[])
//     {
//         int c=0;
//         int a1[]=new int[5];
//         for(int i=0;i<a.length-2;i++)
//         {
//             for(int j=i;j<a.length-1;j++)
//             {
//                 if(a[i]==a[j])
//                 {
//                     c++;
//                 }
//             }
//             a1[i]=c;
//         }
//         for(int k=0;k<a.length-1;k++)
//         {
//             System.out.println(a1[k]+ " ");
//         }
//         return c;
//     }
// }

// import java.util.*;

// public class test{
//     public static void main(String[] args) {
//         int a[] = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 4, 5};  // Sorted array
        
//         Map<Integer, Integer> frequencyMap = new HashMap<>();  // Use a HashMap to store frequencies

//         // Count frequencies
//         for (int i = 0; i < a.length; i++) {
//             frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0) + 1);
//         }

//         // Print the frequencies
//         System.out.println("Element frequencies:");
//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println("Element " + entry.getKey() + ": " + entry.getValue() + " times");
//         }
//     }
// }

// import java.util.Arrays;

// public class FrequencyCounter {
//     public static void main(String[] args) {
//         int[] l = {1, 2, 3, 1, 1, 2, 2, 5, 5, 3};
//         int maxElement = Arrays.stream(l).max().getAsInt();  // Find the maximum element in the array
//         // int[] frequencies = new int[maxElement + 1];  // Create an array to store frequencies

//         // // Count the frequencies of each element
//         // for (int i = 0; i < l.length; i++) {
//         //     frequencies[l[i]]++;
//         // }

//         // // Print the frequencies
//         // for (int i = 0; i < frequencies.length; i++) {
//         //     if (frequencies[i] > 0) {
//         //         System.out.println(i + " appears " + frequencies[i] + " times");
//         //     }
//         // }
//         System.out.println(maxElement);
//     }
// }

// public class testfile {
//     public static void main(String[] args) {
//         int a[]={1,1,1,1,2,2,2,2,2,2,3,4,5};
//         System.out.println(countarray(a));
//     }
//     public static int countarray(int a[])
//     {
//         for(int i=0;i<a.length;i++)
//         {
//             int c=0;
//             for(int j=0;j<a.length;j++)
//             {
//                 if(a[i]==a[j])
//                 {
//                     c++;
//                 }
//             }
//             return c;
//         }
//     }
// }

// public class testfile
// {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6,7,8,9};
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println(a[i]+ " ");
//         }
//     }
// }

public class testfile
{
    public static void main(String[] args) {
        int a=4;
        int b=10;
        int c=8;
        int d=16;
        if(a<b || d<c)
        {
            System.out.println("Raj");
        }
        else
        {
            System.out.println("Shree");
        }
    }
}