

abstract class Animal {
 abstract void sound();
}
   class Dog extends Animal {
    @Override   //overriding mechanism in Java, where a subclass provides its own implementation of a method that is already defined in its superclass.
    public void sound() {
        System.out.println("Barking...Bhauu bhaau bhaau");
    }
   }
   class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meowing...Meow meow meow");
    }
}

    class TestAbstraction{
        public static void main(String[] args) {
            Animal dog = new Dog();
            Animal cat = new Cat();
            dog.sound();
            cat.sound();
    
    }
    
}
