public class roman {
    public static void main(String[] args) {
       int  number[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4,1};
       String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL","X", "IX", "V", "IV","I"};
       int num=49;
       String result="";
       for(int i=0;i<number.length;i++)
       {
          while(num>=number[i])
          {
             result=result+roman[i];
             num=num-number[i];
          }
       }
       System.out.println(result);
    }    
}
