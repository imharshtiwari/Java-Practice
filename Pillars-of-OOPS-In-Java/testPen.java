   abstract class Pen {
     abstract void write();
     abstract void refill();

   }
   class FountainPen extends Pen {
      void write() {
        System.out.println("Writing on fountain pen");
     }
      void refill() {
        System.out.println("Refilling fountain pen");
     }
      void changeNib() {
        System.out.println("Changing Nib");
     }

    }

public class testPen {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen() ; 
        pen.changeNib();
        pen.write();
    }
}
