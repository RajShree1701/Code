import java.util.*;
public class sumdistinct {
    public static void main(String[] args) {
        int a[]={10,15,15,10,20,30,5,50,50,50};
        int sum1=0;
        HashMap<Integer,Integer> sum=new HashMap<>();
        for(int i:a)
        {
            if(sum.containsKey(i))
            {
                sum.put(i,sum.get(i)+1);
            }
            else
            {
                sum.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: sum.entrySet())
        {
            System.out.println("Key: " +entry.getKey()+ " Value: " +entry.getValue());
            if (entry.getValue() == 3) {  // Element appears only once
                sum1+= entry.getKey();
            }
        }
        System.out.println(sum1);
    }
}
