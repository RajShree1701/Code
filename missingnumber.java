import java.util.HashSet;
public class missingnumber {
    public static void main(String[] args) {
        //int a[]={3,1,-1,0};
        int a[]={4,1,2,0};
        System.out.println(misingnum(a));
    }
    public static int misingnum(int a[])
    {
        int missingnumber=0;
        HashSet <Integer> misnum=new HashSet<>();
        for(int num:a)
        {
            misnum.add(num);
        }
        while(misnum.contains(missingnumber))
        {
            missingnumber++;
        }
        return missingnumber;
    }
}
