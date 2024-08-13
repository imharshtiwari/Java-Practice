import java.util.Scanner;

public class swap2no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        
        int temp = a;   //simplty using temp value
        a = b;
        b = temp;
        System.out.println("You have entered the value of a " + (a ));
        System.out.println("You have entered the value of b " + (b ));

        System.out.println("After Swapping\n The value of a is " +  a  +  "\n and The value of b is " + b);
    }
    
}
