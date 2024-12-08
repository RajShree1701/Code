package LEETCODE.linkedlist;
//create single linked list 
public class LL{  
    Node head;
    private int size;
    LL()
    {
        this.size=0;
    }
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }  
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;// what if this head.next is null that; why we take other condition also:::head.next=null->lastnode=null
        while(lastnode.next!=null)//null.next
        {
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public int getSize()
    {
        return size;
    }
    public void reverse()// reverse of linked lisy by using iterative approach
    {
        if(head!=null || head.next==null)
        {
            return;
        }
        Node prevnode=head;
        Node currnode1=head.next;
        while(currnode1!=null)
        {
            Node nextnode=currnode1.next;
            currnode1.next=prevnode;

            //update
            prevnode=currnode1;
            currnode1=nextnode;
        }
        head.next=null;
        head=prevnode;
    }
    public Node reverse1(Node head)//recursive approach
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newhead=reverse1(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String ars[])
    {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addLast("HEYY");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
       // list.getSize();
        System.out.println(list.getSize());
        list.addFirst("HII");
        System.out.println(list.getSize());
       // list.reverse();
        //list.printList();
        list.head=list.reverse1(list.head);
        list.printList();
    }
}
