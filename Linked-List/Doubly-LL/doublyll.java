//package Doubly-LL;

public class doublyll {
    public static class Node{
        int value;
        Node next,prev; //Node prev; can also be written as short by using ,
    
       Node(int value){
       this.value = value;
      }
    }
        
       //Displaying the list of DLL
      public static void display(Node HEAD){
        Node temp = HEAD ;
        while (temp != null){
            System.out.print(temp.value + " ") ;
            temp = temp.next ;
        }
        System.out.println();
       }
      public static void displayrev(Node TAIL){
        Node temp = TAIL ;
        while (temp != null){
            System.out.print(temp.value + " ") ;
            temp = temp.prev ;
        }
        System.out.println();
       }
       public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        a.next=b;  b.next=c;   c.next=d;   d.next=e;
        /*
        The above code is used to create a Doubly Linked List in which each node has a link to its previous node as well as its next
        The above code is used to create a Doubly Linked List with head node 'a' and other nodes are linked in sequence.
        The above code will create a circular linked list with head node being 'a' and tail is 'e'.
        */
        a.prev = null; //if the value of a.prev is e then it will run infinite in loop 
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        System.out.println("Linked List: ");
        display(a);
        System.out.println("\nCircular Linked List :");
        display(c);
        System.out.println("\nReverse Linked List :");
        displayrev(e);


        
       }
    
}
