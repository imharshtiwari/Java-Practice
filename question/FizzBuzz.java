/**
 * The FizzBuzz class in Java prints numbers from 1 to 100, replacing multiples of 3 with "Fizz",
 * multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
 */

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {  //loop
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                        } else { System.out.println(i); 
                       }
                        }
                    }
    }
    

