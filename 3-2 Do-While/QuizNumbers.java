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
        }
    }
}
