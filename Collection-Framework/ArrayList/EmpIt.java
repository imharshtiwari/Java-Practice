class Emp {
    String name , cmpname ; 
    int id ;
    public Emp(String name , int id , String cmpname) {
        this.name = name;
        this.id = id;
        this.cmpname = cmpname;
    }
    
  //  @Override
   // public String toString() {
     //   return " name=" + name + ", id=" + id + ", cmpname=" + cmpname + " ";
   // }    //Override
}

public class EmpIt {

    public static void main(String[] args) {
        Emp e1 = new Emp("John Doe", 101, "ABC Corp");
        Emp e2 = new Emp("Jane Doe", 102, "XYZ Corp");

    }

}
