import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // initialise
        int balance = 0;

        while (true) {
            System.out.println("Please insert coins:");
            Scanner in = new Scanner(System.in);
            // insert coins
            int amout = in.nextInt();
            balance += amout;

            if (balance >= 10) {
                // print a ticket

                System.out.println("****************");
                System.out.println("**Central Line**");
                System.out.println("*******£10******");
                System.out.println("****************");

                System.out.println("Changes: " + (balance - 10));
                balance = 0;
            } else {
                System.out.println("Balance is not enough, please insert more coins.");
            }

        }

    }

}
