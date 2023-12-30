import java.util.Scanner;

public class CountingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Shortcut: command + .
        int number;
        int count=0;
        int sum=0;

        number = in.nextInt();
        while(number!=-1){
            sum += number;
            count += 1;

            number = in.nextInt();
            // To update the number
        }
        if(count>0){
            System.out.println("Average is "+(double)sum/count);
            // When dividing two integers in Java, the result is also an integer, where any fractional part of the outcome is discarded.
        }
        in.close();
    }
}
