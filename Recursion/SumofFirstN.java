public class SumofFirstN {

    public static void FnNN(int i,int n , int sum){  //the sequence of the parameter should be same.
    if (i==n){
        sum += i;
        System.out.println(sum);
        return ; 
    }  

      sum += i;
      FnNN(i+1,n,sum);
      System.out.println(i);

    }

    public static void main(String[] args) {
      FnNN(1,5,0);

    }
    
}
