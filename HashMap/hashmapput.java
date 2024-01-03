import java.util.*;
/**
 * hashmapput
 */

public class hashmapput {
 
    public static void main(String[] args) {
            //Create an empty hash map by declaring object
        // of string and integer type
    Map<String,Integer> mp = new HashMap<>();

    // adding elements to the Map
     mp.put("Ram", 100);
     mp.put("Krishna", 150); 
     System.out.println();  
     System.out.println("After Adding Elements");
     System.out.println();
     //Printing element 
     System.out.println(mp.get("Ram"));
     System.out.println(mp.get("Krishna"));
     System.out.println();
     //Printing all the element in the Hashmap using for each loop
     for (Map.Entry m : mp.entrySet())
     System.out.println("Key: " +m.getKey()+" Value:"+m.getValue());
     int key=15;//We are searching this Key in our Hasmap
     if(mp.containsKey(key))
     {
        Integer val=(Integer) mp.get(key);
        System.out.println("\nValue Corresponding to the given Key is "+val);
        }
        else{ System.out.println("The Given Key does not Exist!");}
        //Putting a New value against existing Key
        mp.put("Krishna",200);
        System.out.println("\n\nAfter Updating Value Against Same Key");
        for (Map.Entry m : mp.entrySet())
        System.out.println("Key: " +m.getKey()+" Value:"+m.getValue());
        //Removing the pair whose Key is Krishna
        mp.remove("Krishna");
        System.out.println("\n\nAfter Removing One Pair from the Hashmap");
        for (Map.Entry m1 : mp.entrySet())
        System.out.println("Key: " +m1.getKey()+" Value:"+m1.getValue());
        //using of ifabsent it will add the entries only if the enteries is not added or not found.
        mp.putIfAbsent("Balram",300);
        mp.putIfAbsent("Balram",400);
        System.out.println("\n\nUsing putifAbsent Method");
        for (Map.Entry m2 : mp.entrySet())  //m2 is a variable 
        System.out.println("Key: " +m2.getKey()+" Value:"
        +"\""+m2.getValue()+"\"");
        


    } 
}