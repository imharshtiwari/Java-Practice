
interface Bycycle{
    int a= 45 ;
    void pedal();
    void brake();    
}
interface blowhorn{   //we can user more than one interface but incase of abstract it is not applicable
    void blowhorn();
}

class Avon implements Bycycle , blowhorn{
    public void pedal(){
        System.out.println("Avon pedaling");
    }
    
    public void brake(){
        System.out.println("Avon braking");
    }
    
    public void blowhorn(){
        System.out.println("pe peepp pee peeee");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Avon cycle = new Avon();
        cycle.pedal();  //we can create properties in interface
        System.out.println("You are pedalling"); 
        cycle.brake();
        System.out.println(cycle.a); //We can't modify the properties in interface as they are final
        cycle.blowhorn();
        
    }
}
