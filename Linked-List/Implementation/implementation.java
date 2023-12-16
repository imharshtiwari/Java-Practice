package Implementation;
import java.util.*;


public class implementation {


    public static class Node {
        int data; // head of list
        Node next; // address of the next node

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head;

        void insertAtEnd(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }

        void display() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        int size(){
            Node current=head;
            int count=0;
            while(current!=null){
                count++;
                current=current.next;
                }
                return count;
                
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(8);
        linkedList.display();
        System.out.println("Size: "+linkedList.size());
    }
}