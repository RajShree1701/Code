import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int friend=sc.nextInt();
        int notfriend=sc.nextInt();
        if(friend>=notfriend)
        {
           System.out.println("Friend");
           System.out.println("Happy Friendship Day");
        }
        else
        {
            System.out.println("Not friend");
        }
        sc.close();
    }
}   
