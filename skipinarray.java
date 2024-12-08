/*input a[]={1,2,3,4,5,6}
 *output={1,3,5} explaination: skip the one then print other

 inptut={1,3,5,7,9}
 output={1,5,9}
 */
// import java.util.ArrayList;
// public class skipinarray {
//     public static void main(String[] args) 
//     {
//         //int a[]={1,2,3,4,5,6,7,8};
//         int a[]={1,3,5,7,9};
//         System.out.println(skipnum(a));
//     }
//     public static ArrayList<Integer> skipnum(int a[])
//     {
//         ArrayList<Integer> result=new ArrayList<>();
//         for(int i=0;i<a.length;i=i+2)
//         {
//             result.add(a[i]);
//         }
//         return result;
//     }
// }

public class skipinarray
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i=i+2)
        {
            System.out.print(a[i]+" ");
        }
    }
}