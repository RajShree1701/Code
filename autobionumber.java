import java.util.HashSet;
public class autobionumber {
   public static void main(String[] args) {
        String num = "1210";
        countt(num);
    }

    public static void countt(String num) {
        // Create a HashSet to store unique characters
        HashSet<Character> s = new HashSet<>();

        // Add each character of the string to the set
        for (char c : num.toCharArray()) {
            s.add(c);
        }

        // Print the size of the set (number of unique characters)
        System.out.println(s.size());
    }
}

