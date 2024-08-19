public class fibonacci {                  //sum of two previous no.
     
    public static void fibo(int a,int b,int n){
    if (n==0){         //base case
        return ;
    }
      int c = a + b;    //third variable to store sum of two previous no.
      System.out.println(c);    //print c
      fibo(b,c,n-1);          //not proceeding to print next no so we have named b as a and c as a b and
                                //then we have reduce by n-1 to print current fibonacci no.
    
    }

   public static void main(String[] args) {
    int a= 0;                //initialize a,b and n
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    int n = 15;
    fibo(a,b,n-2);
    
    }
}
