// package raj;
// public class LL {

//     private Node head;
//     private Node tail;

//     private int size;

//     public void insertfirst(int val){
//         Node node = new Node(val);
//         node.next = head;
//         head = node;

//         if(tail == null){
//             head = tail;
//         }

//         size += 1;
//     }

//     public LL(){
//         this.size = 0;
//     }
    
//     private class Node {
//         private int value;
//         private Node next;

//         public Node(int value){
//             this.value = value;
//         }
//         public Node(int value, Node next){
//             this.value = value;
//             this.next = next;
//         }
//     }

//     public void display(){
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.value + " -> ") ;   
//             temp = temp.next;       
//         }
//     }

// }

package raj;
public class LL {

    private Node head;
    private Node tail;
    private int size;

    // Constructor to initialize an empty linked list
    public LL() {
        this.size = 0;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head; // Point the new node to the current head
        head = node; // Update the head to the new node

        if (tail == null) {
            tail = head; // If the list was empty, update the tail as well
        }

        size++; // Increment the size of the linked list
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to get the size of the linked list
    public int getSize() {
        return size;
    }

    // Private Node class to represent each node in the linked list
    private class Node {
        private int value;
        private Node next;

        // Constructor for a node with only a value
        public Node(int value) {
            this.value = value;
        }
    }
}
