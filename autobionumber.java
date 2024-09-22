import java.util.HashSet;

public class autobionumber
{
    public static void main(String[] args) {
        String c="1210";
        System.out.println(auto(c));
    }
    public static int auto(String c)
    {
        HashSet <Character> s =new HashSet<>();
        for(char i:c.toCharArray())
        {
            s.add(i);
        }
        return s.size();
    }
}