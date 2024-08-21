import java.util.*;

public class nPowerlogn {
    public static int PowLog(int x, int n){
        if (n == 0 ){
            return 1;
        }
        if (x == 0 ){
            return 0;
        }
        if (n % 2 == 0){  //When the n is even
        return PowLog(x, n/2) *  PowLog(x, n/2) ;

         }else {       //when the n is odd
            return PowLog(x, n/2) * PowLog(x, n/2) * x ;              //only the stack height is log n although
                                                                    //both are same but it reduces the code
        }
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the power no.");
        int x = sc.nextInt();
        System.out.println("Enter the base no");
        int n = sc.nextInt();
          System.out.println("The result is "+ PowLog(x,n));
    }
}
