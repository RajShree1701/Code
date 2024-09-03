import java.util.*;
class level 
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int level=sc.nextInt();
        int total=level*(3*level+1)/2;
        System.out.println(total);
        sc.close();
    }
}