import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int isPrime = 1;

        for (int i = 2; i < n; i++) {
            // 1 is not a prime number, so we start from 2
            if (n % i == 0) {
                isPrime = 0;
                System.out.println(n + " is not a prime number, i=" + i);
                break;
            } else if (isPrime == 1) {
                System.out.println(n + "is a prime number.");
            } else {
                System.out.println(n + "is not a prime number.");
            }

        }

        in.close();

    }

}
