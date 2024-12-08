public class sumofseries {
    public static void main(String[] args) {
        int n=5;
        int num=2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=num;
            num=num*10+2;
        }
       //System.out.println(num);
        System.out.println(sum);
    }
}
