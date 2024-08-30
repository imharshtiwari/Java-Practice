import java.util.*;

public class halfpyramid {
      public static void calpy(int  n) {
        for(int i =1 ; i<n; i++){   //traversing over the rows
                 
            //print the  spaces r-i

            for(int j = 1; j<n-i; j++){   
             System.out.print(" ");
            }  
              //print the star 2*i-1
            for (int k = 1; k<=2*i-1;k++){
            System.out.print("*");  
        } 

        System.out.println();  //print the new line
    }
}
    
    public static void main(String[] args) {
        System.out.println("Enter the no you want to print ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calpy(n);
    }
}
