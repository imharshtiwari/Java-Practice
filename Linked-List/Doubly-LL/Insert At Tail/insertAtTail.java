public class insertAtTail{
  /*
  * Given a linked list and an integer x, the task is to insert a new node with data x at the tail of the linked list.
  * Insert a node at the tail of a linked list.
  */
   public static class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
      this.data = data;

    }
   }
   static void insertatEND(Node tail , int x){
       Node temp = new Node(x) ; 
       tail.next = temp;
       tail = temp;
       
   }
       
    public static  void display(Node kuchtohai){
      while (kuchtohai!=null) {
        System.out.print(kuchtohai.data + " ");
        kuchtohai  = kuchtohai.next;

      }
       System.out.println(" ");
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
      //insertion of element at the end of Linked List
      System.out.println("The given Double Linked List is are : ");
      display(a);
      System.out.println("The Double Linked List after adding 30 at the tail of given list : ");
      insertatEND(d,30);
      display(a);
     }
}