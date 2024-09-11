import java.util.*;
class dectonbase {
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        System.out.println(dectonbase1(n,num));
        sc.close();
    }
    public static String dectonbase1(int n,int num)
    {
        String res="";
        int quotient=num/n;
        ArrayList<Integer> rem=new ArrayList<>();
        rem.add(num%n);
        while(quotient!=0)
        {
            rem.add(quotient%n);
            quotient=quotient/n;
        }
        for(int i=0;i<rem.size();i++)
        {
            if(rem.get(i)>9)
            {
                res=(char)(rem.get(i)-9+64)+res;
            }
            else
            {
                res=rem.get(i)+res;
            }
        }
        return res;
    }
}
