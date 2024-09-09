/*You are a poor person in an island. There is only one shop in this island, this shop is open on all days of the week except for Sunday. Consider following constraints: 

N – Maximum unit of food you can buy each day.
S – Number of days you are required to survive.
M – Unit of food required each day to survive.
Currently, it’s Monday, and you need to survive for the next S days. 
Find the minimum number of days on which you need to buy food from the shop so that you can survive the next S days, or determine that it isn’t possible to survive. 
Examples: 

Input : S = 10 N = 16 M = 2 
Output : Yes 2 
Explanation 1: One possible solution is to buy a box on the first day (Monday), it’s sufficient to eat from this box up to 8th day (Monday) inclusive. Now, on the 9th day (Tuesday), you buy another box and use the chocolates in it to survive the 9th and 10th day.
Input : 10 20 30 
Output : No 
Explanation 2: You can’t survive even if you buy food because the maximum number of units you can buy in one day is less the required food for one day.
*/
 import java.lang.Math;
// public class maxfood {
//     public static void main(String[] args) {
//         int s=10;
//         int n=16;
//         int m=2;
//         if(n<m)
//         {
//             System.out.println("no");
//         }
//         int totalmeal=s*m;
//         int totalsunday=(s/7);
//         int availableday=s-totalsunday;
//         int minday=(int)Math.ceil((double)totalmeal/n);
//         if(minday<=availableday)
//         {
//             System.out.println("yes"+ " " +minday);
//         }
//         else
//         {
//             System.out.println("no");
//         }
//     }
// }

public class maxfood
{
    public static void main(String[] args) {
        int s=10;
        int n=16;
        int m=2;
        System.out.println(food(s,n,m));
    }
    public static String food(int s,int n,int m)
    {
        if(n<m)
        {
            System.out.println("NO");
        }
        int totalday=s/7;
        int avaiableday=s-totalday;
        int totalfood=s*m;
        int minday=(int)Math.ceil((double)totalfood/n);
        if(avaiableday>minday)
        {
            return "Yes" + minday;
        }
        return "no";
    }
}
