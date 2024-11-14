// import java.util.HashMap;
// import java.util.Map;

// public class arrayfrequencyodd {
//     public static void main(String[] args) {
//         int arr[]={1,1,1,2,2,3,3,3,4,4};
//         System.out.println(frequencyodd(arr));
//     }
//     public static String frequencyodd(int arr[])
//     {
//         HashMap<Integer,Integer> odd=new HashMap<>();
//         for(int i:arr)
//         {
//             if(odd.containsKey(i))
//             {
//                 odd.put(i,odd.get(i)+1);
//             }
//             else
//             {
//                 odd.put(i,1);
//             }
//         }
//         StringBuilder odd1=new StringBuilder();
//         for(Map.Entry<Integer,Integer> entry:odd.entrySet())
//         {
//             System.out.println("Key: " +entry.getKey()+ " Value: " +entry.getValue());
//             if(entry.getValue()%2!=0)
//             {
//                 odd1.append(entry.getKey()).append(", ");
//             }
//         }
//         if (odd1.length()>0) 
//         {
//             odd1.setLength(odd1.length()-2);
//         }
//         return odd1.toString();
//     }
// }

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class arrayfrequencyodd
{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,4};
        System.out.println(frequencyodd(arr));
    }
    public static ArrayList<Integer> frequencyodd(int arr[])
    {
        ArrayList<Integer> odd1=new ArrayList<>();
        HashMap<Integer,Integer> odd=new HashMap<>();
        for(int i:arr)
        {
            odd.put(i,odd.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:odd.entrySet())
        {
            if(entry.getValue()%2!=0)
            {
                odd1.add(entry.getKey());
            }
        }
        return odd1;
    }
}