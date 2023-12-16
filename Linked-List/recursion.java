import java.util.Scanner;

public class recursion {

   static int fact(int n){
      if (n ==0){
         return 1;
      }
      int ans = n*fact(n-1);
      return ans;
   }
  static int fibno(int n){
   if(n==0){
      return n;
   }
   if(n==1){
      return n;
   }
   
   //int prev = fibno(n-1);
  // int prevPrev = fibno(n-2);
  // return prev + prevPrev;
   return fibno(n-1) + fibno(n-2);
  }
 /*public static int nth(int b){
   if(b==0){
      return b;
   }
   if(b==1){
      return b;
   }
   
   //int prev = fibno(n-1);
  // int prevPrev = fibno(n-2);
  // return prev + prevPrev;
   return nth(b-1) + nth(b-2);
  }  */

   // Driver method to test above
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      System.out.println("The Factorial of " + n + " is " + fact(n));
      System.out.println();
      
      System.out.println("Fibonacci number of " + n + " is "+fibno(n));
     //  for (int i = 0 ; i<=10;i++){
     // System.out.println("Fibonacci number of " + " is " + nth(b));
       
   }

}