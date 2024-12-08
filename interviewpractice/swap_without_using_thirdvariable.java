package interviewpractice;

public class swap_without_using_thirdvariable {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ " " +b);
    }
}
