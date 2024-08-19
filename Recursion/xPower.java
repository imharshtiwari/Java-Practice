import java.util.* ;

public class xPower {           //stack height max is n
 
     public static int calPow(int x, int n){
    if (n==0){              //base case 1
        return 1;
    }
    if (x==0){               //base case 2
        return 0;
    }
      int xPowern = calPow(x , n-1);       //work
      int xPower = x * xPowern ; 
      return xPower;

     }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int x = sc.nextInt();
        System.out.println("Enter the power: ");
        int n = sc.nextInt();
        System.out.println("The result is: "+calPow(x,n));

        //int x = 2;
        //int n = 3;
        //int ans = calPow(x, n);
        //System.out.println(ans);
    }
}
