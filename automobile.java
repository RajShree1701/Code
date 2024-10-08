import java.util.Arrays;

public class automobile {
    public static void main(String[] args) {
        int v=200;
        int w=540;
        int[] result = vehicle(v, w);
        if (result != null) 
        {
            System.out.println(Arrays.toString(result)); // Print the array values
        } 
        else 
        {
            System.out.println("Invalid input");
        }
        //System.out.println(result);
    }
    public static int[] vehicle(int v,int w)
    {
        if((w<2*v)||(w>4*v)||(w%2!=0))
        {
            return null;
        }
        int t=(4*v-w)/2;
        int f=v-t;
        return new int[]{t, f};// return two number 
    }
}

