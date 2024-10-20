
class Monkey {
    public void jump() {
        System.out.println("Monkey juming");
    }
    
    public void bite() {
        System.out.println("Monkey biting");
    }
}
interface BasicAnimal {
    void Sleep();
    void Eat();
}

class Human extends Monkey implements BasicAnimal {
    
    public void speak() {
        System.out.println("Human speaking");
    }
    
    @Override    //override
    public void Sleep() {
        System.out.println("Human sleeping");
    }
    
    @Override
    public void Eat() {
        System.out.println("Human eating");
    }
}

public class testHuman {
    public static void main(String[] args) {
        Human human = new Human();
        human.speak();
        human.jump();
        human.bite();
        human.Sleep();
        human.Eat();  // Polymorphism in action. Monkey's methods are overridden in Human class..
        Monkey m = new Human();
    
        m.bite();  // Monkey calls this method when the user requests a bite ..
    }
}
