 class overriding {
    int a = 20;
    int b = 30;


   public void print() {
       System.out.println("a and b are: " + a + " " + b);
       
   }
}

 class Child extends overriding{
    int c = 10;
    int a = 50;

   @Override
   public void print() {
      
       System.out.println("a and b are: " + super.a + " " + b); //super used to refer to the parent class instance.
       System.out.println(this.a);   //this keyword refers to the current class instance..
   }

   public void printAll() {
       System.out.println("a, b and c are: " + a + " " + b + " " + c);
   }
}

public class over_poly {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
      //  child.printAll();
      
    }
}
