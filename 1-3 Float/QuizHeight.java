import java.util.Scanner;

public class QuizHeight {
    public static void main(String[] args) {
        System.out.println("Please enter your height in feet and inches separatly,");
        System.out.println("For example, '5 7' means '5 feet 7 inches':");
        Scanner in = new Scanner(System.in);
        int foot = in.nextInt();
        int inch = in.nextInt();
        // float meter = (float) ((foot+inch/12)*0.3048);
        // 10 is an int, while 10.0 is a float
        // 
        double meter = ((foot+inch/12.0)*0.3048);
        System.out.println("Your height is "+meter+"m.");
    }
}
