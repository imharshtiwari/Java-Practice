
import java.util.Scanner;


public class num_rectangle {

    public static void cal(int n ){
        
        for(int i = 1; i<=n ;i++){
          for(int j = i; j<=n ;j++){
            System.out.print(j);

        } for(int k=1 ; k<=i-1;k++){

           System.out.print(k);
        }
         System.out.println("");
    }  
}
    public static void main(String[] args) {

     System.out.println("Entr no");
     
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("");
     cal(n);
    }
}
