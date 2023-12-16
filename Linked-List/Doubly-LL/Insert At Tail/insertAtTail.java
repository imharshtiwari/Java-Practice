//package Doubly-LL.Insert At Tail;

public class insertAtTail {
    public static class Node{
        int data;
        Node next,prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            }
        }
        public static Node  InsertAtTail(Node tail,int x){
          Node t = new Node(x);
            if(tail==null){
            tail = t;
          } else {
           Node temp = tail;
           while(temp.next != null){
            temp=temp.next;
           }

            
            temp.next =t;
           
            t.prev = temp;
                     }

            return tail;
                    } 
          
        public static void display(Node kuchbhi){
            Node temp = kuchbhi;
            while(temp.prev!=null){
                System.out.print(kuchbhi.data+" ");
                temp=temp.next;

            }
        }

      public static void main(String[] args) {
        
    Node a = new Node(11);
    Node b = new Node(22);
    Node c = new Node(33);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = null;
        
        
    
    System.out.println("Given Linked List:");
    display(a);
    System.out.println("\nElement to be inserted at the end of the linked list is : 9");
    InsertAtTail(c,9);
    System.out.println("\nLinked List after inserting an element at the end using Insertion Method :");
    display(c);


      }  
    }


