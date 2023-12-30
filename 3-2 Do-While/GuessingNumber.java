import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int x;
        int number;
        number = (int) Math.random();
        // need a cast
        // [0,1)
        number = (int) (Math.random()*100);
        // [0.100)
        number = (int) (Math.random()*100+1);
        // [0.100]

        do{
            x = in.nextInt();
            count+=1;
            if(x>number){
                System.out.println("Higher. Guess again:");
            }
            else if(x<number){
                System.out.println("Lower, Guess again:");

            }
        }while(x!=number);
        System.out.println("Correct! You've guessed the number in " + count + " tries.");

        in.close();
    }
}
