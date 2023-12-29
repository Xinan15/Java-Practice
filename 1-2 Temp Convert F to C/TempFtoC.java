import java.util.Scanner;

public class TempFtoC {
    
    public static void main(String[] args) {

        System.out.println("Please enter a temperature in Fahrenheit");

        Scanner in = new Scanner(System.in);

        // nextInt() Method: This method waits for the user to enter an integer, and then reads the integer value.
        
        int f = in.nextInt();

        int c = (int)((f - 32) * 5/9);
        // Formula: (32°F − 32) × 5/9 = 0°C
        // (int)x: convert x into an int
        
        System.out.println(f+" degrees Fahrenheit equals "+c+" degrees Celsius");
    }
}
