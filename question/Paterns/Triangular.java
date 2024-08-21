import java.util.*;

public class Triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the no. you want to print in star");
        int n = sc.nextInt();

        for(int i =  1; i <= n; i++) {    //Outer loop that govern row
            for(int j = 1; j <= i; j++) {   //Inner loop , this loop govern coloumn
                System.out.print("*");          
            } 
        System.out.println();
     }
    }
}
