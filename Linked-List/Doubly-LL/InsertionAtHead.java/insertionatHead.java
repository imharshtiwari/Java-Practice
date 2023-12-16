

public class insertionatHead {
    public static class Node{
        int data;
        Node next,prev;
    
    Node (int data){
        this.data = data;
    }
}
    public static Node insertAtHead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
     return head;
    }
    // Function to print the doubly linked list
    public static void display(Node show){
         while (show!=null) {
            System.out.print(show.data + " ");
            show=show.next;
            }
            System.out.println();
    }
            
    
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(22);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        
        
        /*
        The doubly linked list should look like:
        Head->5->10->15->22->NULL
        */
        System.out.println("Original Linked List");
        display(a);
        System.out.println("\nLinked List after inserting 3 at the beginning using insertAtHead() function");
        display(insertAtHead(a,3));

    }
    }

