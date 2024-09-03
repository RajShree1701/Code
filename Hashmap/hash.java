package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Raj",20);
        students.put("Shree",21);
        students.put("Avigya",22);
        students.put("Sutapa",25);
        students.put("Aryan",18);
        students.put("Aryanee",20);
        for (Map.Entry<String, Integer> entry : students.entrySet())
        {
            System.out.println("Key: " +entry.getKey()+ " Value: " +entry.getValue());
        }
    }
}
