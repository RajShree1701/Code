/* Given two integers a and b , your task is to determine the sum of the cubes of all the numbers 
in the range from a to b .
sample input : a=4, b=9  output =1989*/
public class cubesum {
    public static void main(String[] args) {
        int a=4;
        int b=9;
        System.out.println(cubessum(a,b));
    }
    public static int cubessum(int a,int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            int cube=i*i*i;
            sum+=cube;
        }
        return sum;
    }
}
