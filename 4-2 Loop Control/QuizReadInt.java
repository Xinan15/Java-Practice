/*
    Read integer

    Your programme needs to read an integer within the range of -100,000 to 100,000.
    Then, it should output each digit of this integer in Chinese Pinyin.
    
    For example, if you input 1234, the output will be: yi er san si

    Note that there should be a space between the Pinyin of each character, but no space following the final character.
    When encountering a negative number, prepend "fu" to the beginning of the output. 
    
    For instance, -2341 should be output as: fu er san si yi

    Input example:
    -30

    Output sample:
    fu san ling
 */

import java.util.Scanner;

public class QuizReadInt {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        in.close();

        if(n>0){

        }else if(n<0){

        }else{

        }
    }
}

// Not completed