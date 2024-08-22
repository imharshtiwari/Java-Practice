import java.util.*;

public class halftriangle {
   
    public static void calpy(int x){
        for(int i =  1; i < x; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" *");
                }
                System.out.println(" ");
                }

    }
 

    public static void main(String[] args) {
        System.out.println("Enter the no you want to print");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        calpy(x);


    }
}
