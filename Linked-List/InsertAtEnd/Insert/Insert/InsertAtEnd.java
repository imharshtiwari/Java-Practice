

public class InsertAtEnd {

        // Write a program in Java to insert an element at the end of a linked list.
        public static class Node {
            int data;
            Node next;
    
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
                    Node temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                }
            }
    
            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }
    
        public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();
            linkedList.insertAtEnd(5);
            linkedList.insertAtEnd(9);
            linkedList.insertAtEnd(15);
            linkedList.insertAtEnd(10);
            linkedList.insertAtEnd(17);
            linkedList.display();
        }
    }

