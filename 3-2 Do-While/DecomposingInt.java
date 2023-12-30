import java.util.Scanner;

public class DecomposingInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;
        int digit;

        while(number>0){
            digit = number % 10;
            result = result*10 + digit;
            System.out.println(digit);
            number = number / 10;
        }
        System.out.println();
        System.out.println(result);
        in.close();
    }

}
/*
    To break down an integer into its constituent digits:
    
    1. Use %10 to obtain the last digit (the unit digit).
    2. Divide the integer by 10 to discard the last digit.
    3. For the next digit (like the tens place), apply %10 to the truncated number.
    4. Continue this pattern, dividing by 10 and then using %10, to sequentially access each digit from right to left in the original number.
*/