import java.util.ArrayList;

public class sumonlist {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6};
        System.out.println(sum(n));
    }
    public static ArrayList<Integer> sum(int n[])
    {
        ArrayList <Integer> sumlist=new ArrayList<>();
        int sum1=0;
        for(int i=0;i<n.length;i++)
        {
                sum1+=n[i];
                sumlist.add(sum1);
        }
        return sumlist;
    }
}
