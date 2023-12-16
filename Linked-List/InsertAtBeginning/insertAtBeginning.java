//package InsertAtBeginning;

public class insertAtBeginning {
    public static class Node {
    int data ; 
    Node next ;
    
    Node(int data){
        this.data = data ;
    }
}
    public static class addinStart{
        Node head;
     void AddinStart(int Value){
        Node temp = new Node(Value);
        if (head == null)
        head = temp;
        else{
    
            temp.next=head;
            head=temp;
            }
     }
    
      void display(){
       Node temp = head;
       while(temp.next !=null ){
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
    
}
// Driver Code
   public static void main(String[] args) {
    addinStart add = new addinStart();
    // Adding elements to the list
    add.AddinStart(134);
    add.display();
    add.AddinStart(18);
    add.display();
    add.AddinStart(25);
    add.display();
    add.AddinStart(2);
    add.display();
    System.out.println("Given Linked List");
    add.display();
    System.out.println("\nInserted Element at Begining");
    add.AddinStart(-4);
    add.display();   
    }
   }
