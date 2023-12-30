/* 
    Odd and even numbers
    Your program is required to read a series of positive integer data.
    The program should output the count of odd and even numbers in the data read.

    Entering -1 signifies the end of input, and -1 itself is not considered part of the input data. 
    
    Input format: A series of positive integers, within the range (0,100000). If -1 is entered, it indicates the completion of the input.
    Output format: Two integers; the first integer represents the count of odd numbers in the read data, and the second integer represents the count of even numbers. These two integers should be separated by a space.

    For example:
    Input: 9 3 4 2 5 7 -1
    Output: 4 2
*/

// zero is an even number

import java.util.Scanner;

public class QuizNumbers{

    public static void main(String[] args) {

        int oddCount = 0;
        int evenCount = 0;

        while(true){
            System.out.println("Please enter a positive integer data:");
            Scanner in = new Scanner(System.in);

            // Scanner: to create an instance of the Scanner class, This instance is typically used to read input from various sources, 
            // in: The variable name for the Scanner instance.
            // new Scanner(System.in): This is the construction of a new Scanner object.
            // new: to create a new instance of a class.
            // System.in: refers to the standard input stream, which is usually linked to the keyboard input in most environments. 
            // This means that the Scanner is set up to read input from the keyboard.
             
            int number = in.nextInt();

            if(number == -1){
                break;
            }
            if(number%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            System.out.println(oddCount + " " + evenCount);

            in.close();
            // If you're sure you won't need to read from System.in again, it's safe and good practice to close your Scanner.

        }

    }
}
