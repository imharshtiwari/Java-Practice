public class recusrion {
 
 public static void Cal(int n) {   //created a Cal function that perform following task

     if (n == 10) {
    return ;
     }
       System.out.println(n);
       Cal(n+1);

    }

    public static void main(String[] args) {
        int n = 1;
        Cal(n);              //calling function
        }
}
