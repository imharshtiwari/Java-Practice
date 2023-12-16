//package InsertMethod;

public class getElement {
    
    public static class Node{
        int data ;
        Node next ;
        
        Node(int data){
            this.data = data;
            }
        }
      public static class InsertinLinkedList {
          Node head ;
          void InsertMethod(int idx, int value){
            Node ab = new Node(value);
            Node temp = head ;   //for traverse we use this temp variable 
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            ab.next = temp.next;
            temp.next = ab ;
          }
          int getAt(int idx){
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;

            }
            return temp.data;
          }
          
          void display(){
            Node temp = head ;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                }
                System.out.println("");
          }


      }
      public static void main(String[] args) {
        InsertinLinkedList im =new InsertinLinkedList();
        im.head = new Node(1);
        //im.display();
        im.head.next = new Node(2);
        //im.display();
        //im.display();
        im.head.next.next = new Node(3);
        //im.display();
       // im.InsertMethod(2,45);
        //im.display();
        im.head.next.next.next = new Node(4);
        //im.display();
        
        im.head.next.next.next.next =new Node (9);
        //im.display();
        im.head.next.next.next.next.next =new Node (12);
       // im.display();
        im.head.next.next.next.next.next.next =new Node (18);
        im.InsertMethod(4,28);   //1>2>3>28>......exit
         im.display();
         System.out.print(im.getAt(6));
        

      }
    
}
