import java.util.* ;

  public class num_pattern {
    
    public static void cal(int n ){
        
        for(int i = 1; i<=n ;i++){
          for(int j = 1; j<=n ;j++){
            if((i + j ) %  2 == 0 ){   // if i+j =  even then it will print  1
                System.out.print("1");
                }else{
                    System.out.print("2");
                    }
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


