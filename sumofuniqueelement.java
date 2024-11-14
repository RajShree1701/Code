/*
 leet code question no: 1748 -> You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 
Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

import java.util.HashMap;

public class sumofuniqueelement {
    public static void main(String[] args) {
         int n[]={1,2,3,2};
        //int n[]={1,1,1,1};
        //int n[]={1,2,3,4,5};
        System.out.println(sumunique(n));
    }
    public static int sumunique(int n[])
    {
       HashMap<Integer,Integer>count=new HashMap<>();
       int sum1=0;
       for(int i:n)
       {
           count.put(i,count.getOrDefault(i,0)+1);
           System.out.println(count);
       }
       for(int i:count.keySet())
       {
          if(count.get(i)==1)
          {
            sum1+=i;
          }
       }
       return sum1;
    }
}
