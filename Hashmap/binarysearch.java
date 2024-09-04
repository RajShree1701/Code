package Hashmap;
import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int a[]={5,6,7,3,4,7,8};
        int n=7;
        HashMap<Integer,Integer> binary =new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            binary.put(a[i],i);
        }
        List<Integer> sortedKeys = new ArrayList<>(binary.keySet());
        Collections.sort(sortedKeys); 
        System.out.println(sortedKeys);
        // int resultIndex = search(sortedKeys, n);
        // System.out.println(binary.get(sortedKeys.get(resultIndex)));
        System.out.println(binary.get(sortedKeys.get(search(sortedKeys,n))));
    }
    public static int search(List<Integer> sortedKeys , int n)
    {
        int left=0;
        int right=sortedKeys.size()-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(sortedKeys.get(mid)==n)
            {
                return mid;
            }
            else if(sortedKeys.get(mid)<n)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}
