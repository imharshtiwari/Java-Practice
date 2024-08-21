public class Factorial {

    public static int calculatefact (int n ){
        if (n == 0 || n == 1) {    //base case
            return 1;
            }
       int fn = calculatefact(n-1);   //working n n-1
       int result = n * fn;
       return result;
    }
    
    public static void main(String[] args) {
        
        System.out.println(calculatefact(5));
            //or
        int n = 5;
        int ans = calculatefact(n);
        System.out.println(ans);
        
    }
}
