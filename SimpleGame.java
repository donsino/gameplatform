package simplegame;

import java.util.Scanner;

public class SimpleGame {
    
    /**
     * Write a method to convert the given seconds to hours:minutes:seconds.
     * @param seconds to convert
     * @return string for the converted seconds in the format: 23:59:59
     * 
     * Example(s): 
     * - If input seconds is 1432, print and return output in the format: 0:23:52
     * - If input seconds is 0, print and return output in the format: 0:0:0
     * - If input seconds is not valid (negative), print and return: -1:-1:-1.  
     *   So if input seconds is -2, print and return: -1:-1:-1 
     *   If input seconds is -3214, likewise print and return: -1:-1:-1
     */
    public String convertTime(int seconds){
        if (seconds < 0) {
            return "-1:-1:-1";
        }
        
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        
        return hours + ":" + minutes + ":" + remainingSeconds;
    }
    
    /**
     * Write a method that adds all the digits in the given non-negative integer.
     * @param input integer to add digits
     * @return integer in which all the digits in the given non-negative integer are added.
     * 
     * Example(s): 
     * - If input is 565, print and return 16.
     * - If input is 7, print and return 7.
     * - If input is 0, print and return 0.
     */
    public int digitsSum(int input){
        int sum = 0;
        
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        // Create an instance of the SimpleGame class.
        SimpleGame game = new SimpleGame();
        
        // Ask the user which game to play.
        try (Scanner sc = new Scanner(System.in)) {
            // Ask the user which game to play.
            System.out.println("Which game do you wish to play? ");
            System.out.println("1. Convert seconds to hours:minutes:seconds");
            System.out.println("2. Add all the digits in a non-negative integer");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    // If the user enters 1, ask for an integer to convert and call the convertTime method.
                    System.out.println("Enter the number of seconds: ");
                    int seconds = sc.nextInt();
                    String convertedTime = game.convertTime(seconds);
                    System.out.println("Converted time: " + convertedTime);
                    break;
                case 2:
                    // If the user enters 2, ask for an integer and call the digitsSum method.
                    System.out.println("Enter a non-negative integer: ");
                    int num = sc.nextInt();
                    int sum = game.digitsSum(num);
                    System.out.println("Sum of digits: " + sum);
                    break;
                default:
                    System.out.println("Invalid choice! ");
                    break;
            }
        }
    }
}

   

