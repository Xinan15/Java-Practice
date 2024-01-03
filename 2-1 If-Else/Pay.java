import java.util.Scanner;

public class Pay {

    public static void main(String[] args) {
        final double RATE = 8.25;
        // final: Once a final variable is assigned a value, it cannot be altered.
        final int STANDARD = 40;

        double pay = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of hours worked:");

        int hours = in.nextInt();

        System.out.println();

        if (hours > STANDARD)
            pay = STANDARD * RATE + (hours - STANDARD) * (RATE * 1.5);
        else
            pay = hours * RATE;
        
        System.out.println("Gross Earnings: "+pay);

        in.close();

    }

}
