import java.util.*;
public class threemaxmultiply {
    public static void main(String[] args) {
        int a[]={4,5,6,1,2,3,7,8,9};
        int n=a.length;
        Arrays.sort(a);
        int s=a[n-3];
        int s1=a[n-2];
        int s2=a[n-1];
        int mul=s*s1*s2;
        System.out.print(mul);
    }
}
