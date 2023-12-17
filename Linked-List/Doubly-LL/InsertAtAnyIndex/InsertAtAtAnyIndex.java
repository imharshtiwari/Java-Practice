public class InsertAtAtAnyIndex {
    public static class Node{
        int data;
        Node next;
        Node prev;
          
        Node(int data){
            this.data = data;
        }
    }
   public static void InsertATanyIdx(Node head , int idx,int x){
         Node r= head ;   
         for(int i =1;i<=idx-1;i++){
            r = r.next;   //r is at the idx-1 position
         }
        Node t = r.next;  //at idx
        Node s= new Node(x);  
        r.next = s;    
        s.prev =r;
        s.next = t;
        t.prev = s;
    }
     public static void display(Node Value){
        while(Value!=null){
            System.out.print(Value.data+" ");
            Value = Value.next;
            }
            System.out.println();
        } 
        public static void main(String[] args) {
            Node a = new Node(11);
            Node b = new Node(22);
            Node c = new Node(33);
            a.prev = null;           
            a.next = b;
            b.prev = a;
            b.next =c;
            c.prev =b;
            c.next = null;
            System.out.println("The given Doubly Linked List are :");
            display(a);
            System.out.println("Insert value 56 at index 2");
            InsertATanyIdx(a,1,56);
            display(a);


     }
    
}
