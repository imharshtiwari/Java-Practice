import java.util.Scanner;

public class readndprint {
    public static void main(String[] args) {
        // Create a file object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in int. That you want to print");  //print
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
    
}
