import java.util.* ;
public class num_traiangle {
    
    
    public static void cal(int n ){
        
        for(int i = 1; i<=n ;i++){
          for(int j = 1; j<=i ;j++){
            
                System.out.print(j);
    
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




