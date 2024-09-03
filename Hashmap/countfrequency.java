package Hashmap;
import java.util.HashMap;
import java.util.Map;
public class countfrequency {
    public static void main(String[] args) {
        String s="This is a test. This test is simple.";
        s=s.replaceAll("[^a-zA-Z ]","").toLowerCase();
        String words[]=s.split("\\s+");
        HashMap<String, Integer> wordcount=new HashMap<>();
        for(String word : words)
        {
            if(wordcount.containsKey(word))
            {
                wordcount.put(word,wordcount.get(word)+1);
            }
            else
            {
                wordcount.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> entry: wordcount.entrySet())
        {
            System.out.println("Word :" +entry.getKey()+ " Frequency: " +entry.getValue());
        }
    }
}
