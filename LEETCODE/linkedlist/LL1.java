package LEETCODE.linkedlist;
import java.util.*;
public class LL1 {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("heyy");
        list.add("hii");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
        // list.removeFirst();
        // System.out.println(list);
        // list.removeLast();
        // System.out.println(list);
        list.remove(3);// for particular index
        System.out.println(list);
    }    
}
