import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class unique {
    public static void main(String[] args) {
        int num1[]={23,45,67,78,89,34};
        int num2[]={34,89,55,56,39,67};
        System.out.println(uniqueitem(num1,num2));
    }
    public static ArrayList<Integer> uniqueitem(int num1[],int num2[])
    {
        ArrayList<Integer> item=new ArrayList<>();
        for(int i=0;i<num1.length;i++)
        {
            for(int j=0;j<num2.length;j++)
            {
                if(num1[i]==num2[j])
                {
                    item.add(num1[i]);
                    Collections.sort(item);
                }
            }
        }
        return item;
    }
}
