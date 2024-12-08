package LEETCODE.linkedlist;

public class try1 {
    Node head;
    class Node{
        int val;
        Node next;

        Node(int data)
        {
            this.val=data;
            this.next=null;
        }
    }
    public void insertFirst(int data)
    {
        Node node=new Node(data);
        node.val=data;
        // if(head==null)
        // {
        //     node=head;
        //     return;
        // }
        node.next=head;
        head=node;
    }
    public void insertLast(int data)
    {
        Node newnode=new Node(data);
        Node dummy=head;
        while(dummy.next!=null)
        {
            dummy=dummy.next;
        }
        dummy.next=newnode;
    }
    public void display()
    {
        Node dummy=head;
        while(dummy!=null)
        {
            System.out.print(dummy.val + "->");
            dummy=dummy.next;
        }
        System.out.println("Null");
    }
    public static void main(String ars[])
    {
        try1 list=new try1();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(7);
        list.insertLast(8);

        list.display();
    }
}
