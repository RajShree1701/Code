// addition of two in linked list

package LEETCODE.linkedlist;

class ListNode
{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val=val;
    }
}
public class addLL {
    public static ListNode add(ListNode l1,ListNode l2)
    {
        ListNode dummyHead=new ListNode(0);
        ListNode current=dummyHead;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0)
        {
            int sum=carry;
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
        }
        return dummyHead.next;
    }
    public static void printList(ListNode node)
    {
        while(node!=null)
        {
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode result=add(l1,l2);
        System.out.print("Result: ");
        printList(result);
    }
}