
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList al = new ArrayList();

    //Arraylist <String> al = new ArrayList<String>(); // ArrayList<String> this is generic array
    // used to defiine type parameters

    //checking whether list is empty or not
    boolean isEmpty = al.isEmpty();
    System.out.println("Is the ArrayList empty? " + isEmpty);
        
        // Add elements to the ArrayList
        al.add(10);
        al.add(20);
        al.add(20);
        al.add(20);
        al.add("hello");
        al.add(30);
        al.add("hello");
        al.add("hello");
        al.add(50.20);
        al.add("hello world");
    

        
        // Print the ArrayList
        System.out.println("ArrayList: " + al);
        
        // Get the size of the ArrayList
        int size = al.size();
        System.out.println("Size of the ArrayList: " + size);
        
        
        // Get the element at a specific index
        Object element = al.get(2);
        System.out.println("Element at index 2: " + element);
        
        // Remove an element from the ArrayList
        al.remove(2);
        System.out.println("Updated ArrayList: " + al);


        System.out.println("Before update" + al);
        //Set an element at a specific index
        al.set(1, "Adding at 01 index");
        System.out.println("Updated ArrayList: " + al);
        
        
        // Check if an element exists in the ArrayList
        boolean exists = al.contains(30);
        System.out.println("Element 30 exists in the ArrayList: " + exists);
        //or
       // System.out.println(al.contains("hello"));
        

        
    
        
        // Clear the ArrayList
       // al.clear();
       // System.out.println("After clearing the ArrayList: " + al);

        // retain all the elements
        al.retainAll(al);
        System.out.println("After retain " + al);

        //trnasversing arrays
        System.out.println("Before traversal: " + al);
        for (Object obj : al) {      //traversing   using for each element in the array 
            System.out.println(obj);
        }
        System.out.println("After traversal: " + al);
         
       for(int i = 0; i<al.size(); i++){   //using for loop  
           System.out.println(al.get(i));
        }

                 


    }

    
    // Add more methods here to perform other operations on the ArrayList
    // For example, finding the maximum or minimum element, sorting the ArrayList, etc.
    // Feel free to add as many methods as you want!
    }
    // Note: The ArrayList provided here is a generic ArrayList, meaning it can store elements of any type.
    // If you want to store elements of a specific type, you can use a different type of ArrayList, such as ArrayList<String> for storing strings.
    // You can also use custom objects as elements by implementing the Comparable interface in your custom class.
    // For example, if you have a class called "Person" with a name and age, you can create an ArrayList<Person> to store Person objects.
    // If you need more advanced features or need to store custom objects, you may want to consider using a different data structure or library, such as Java's Collections Framework or Apache Commons Collections.
    // Also, remember to handle any potential exceptions that may occur when using the ArrayList, such as IndexOutOfBoundsException or NullPointerException.
    

