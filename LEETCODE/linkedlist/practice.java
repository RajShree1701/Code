package LEETCODE.linkedlist;

public class practice {
    Node head;
    class Node
    {
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
            System.out.print(dummy.val +"->");
            dummy=dummy.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        practice list=new practice();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(3);
        list.display();
    }
}
