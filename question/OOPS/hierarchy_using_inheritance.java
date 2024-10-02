/*Problem Statement:
Design a class hierarchy to model animals.
Create a base class Animal with properties like name and methods like speak().
Extend the Animal class to create specific classes like Dog and Cat which override the speak() method to give appropriate sounds (e.g., Dog barks, Cat meows).
Add additional behaviors like run() to demonstrate method overriding or adding new methods to subclasses.
*/
class Animal{
   void speak() {
    System.out.println("Animal makes a sound.");
   }
     void run(){
        System.out.println("Animal is running.");
    }                                              
}
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks.");
    }
    @Override
    void run(){
        System.out.println("Dog is running fast.");
    }
}

class Cat extends Animal {
    @Override  //overriding the speak() method from Animal class.

    void speak() {
        System.out.println("Cat meows.");
    }
    @Override  //overriding the run() method from Animal class.
    void run(){
        System.out.println("Cat is running slowly.");
    }
}
public class hierarchy_using_inheritance {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.speak();
        animal.run();
      Animal animalc = new Cat();  
        animalc.speak();
        animalc.run();
        animal = new Cat();   //You can define only one variable in main method and call multiple times
        animal.speak( );
        animal.run();                      //with different methods
        

    }
}
