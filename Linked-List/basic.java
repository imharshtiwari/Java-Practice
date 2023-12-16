public class basic {
    public static void displayRecursion(Node head){
        if(head == null) return;
        displayRecursion(head.next);
        System.out.print(head.data+ " ");     
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void display(Node head){
        while(head!=null) {
         System.out.print(head.data + " ");
         head = head.next;   
        }
    }
  public static class Node{
    int data; //value      
    Node next; //address of the node
  
    Node(int data){    //create a constructor
         this.data = data;
    }

    
}

  public static void main(String[] args) {

    Node a = new Node(5);
    Node b = new Node(8);
    Node c = new Node(10);
    Node d = new Node(12);
    Node e = new Node (14);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    System.out.println(a.next);
    System.out.println(a.next.next.next.data);
   // Node temp = a;  //-- temporary node is create not to loose head.
   // for(int i=1;i<=5;i++){   //using for loop displaying the linkedlist
    //System.out.print(temp.data+ " ");
    //temp=temp.next;
    //}
  //  while (temp!=null){  //--Using while loop
    //    System.out.print(temp.data + " ");
      //  temp = temp.next;
    // }
     display(a);
     System.out.println();
     displayRecursion(a); // function recusrion with reverse order
     System.out.println("");
     System.out.print(length(a)); //lenght counting with lenght method 

    }
}

