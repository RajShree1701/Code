public class multiple {
    public static void main(String[] args) {
        int n=12;
        System.out.println(mul(n));
    }
    public static int mul(int n)
    {
        int multiple=1;
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            multiple=n*i;
            System.out.println(multiple);
            sum+=multiple;
        }
        return sum;
    } 
}
