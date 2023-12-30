/*
    Determining the eigenvalues of numbers is a common algorithm used in encoding, with the odd-even characteristic being a straightforward eigenvalue.
    In this context, we consider an integer where each digit is sequentially numbered, starting with the unit digit as number 1, the tens digit as number 2, and so forth. 
    We label the number at the 'n'th position in this integer as x. 
    If x and n share the same parity (both odd or both even), we record a 1; otherwise, we record a 0. 
    
    The binary number is formed by recording the parity of 0 and 1 in the order of the digits of the integer. 
    For instance, the integer 342315 yields the binary number 001101.

    Numbers: 3 4 2 3 1 5
    Digit positions: 6 5 4 3 2 1
    Number parity: odd even odd odd even odd
    Digit parity: even odd even odd even odd
    Parity: 0 0 1 1 0 1
    Binary bit value: 32 16 8 4 2 1

    By summing the bit values corresponding to the binary 1s, we get the result 13. 
    Your program should read a non-negative integer within the range [0, 1000000]. 
    It then calculates the binary number representing the parity as per the algorithm described and outputs its corresponding decimal value. 
    Remember, the integer should be factored from right to left, incrementing the digit count by 1 and doubling the binary value each time.

    Input format:
    A non-negative integer within the range [0, 1000000].

    Output format:
    An integer representing the calculated result.

    Example input: 342315
    Example output: 13
*/

import java.util.Scanner;

public class QuizEigenvalue{

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int number = in.nextInt();
        int digit;
        int position=0;
        int value = 0;
        while (number>0){
            digit = number%10;
            number = number/10;
            // update the number
            position ++;
            if(digit%2 == 0){
                if(position%2==0){

                    value += Math.pow(2, position - 1);

                    // Proper Exponentiation: 
                    // Math.pow(base, exponent) : is the proper way to do exponentiation in Java, where base is raised to the power of exponent.
                    
}
            } else if(digit%2 != 0){
                if(position%2 != 0){
                    value += Math.pow(2, position - 1);

                }
            }
        }
        System.out.println("value: "+value);
        
        in.close();
    }
}

// You can also simplify the If-Else Logic for checking the parity of the digit and the position: 
// If both are either even: (digit % 2) == (position % 2)