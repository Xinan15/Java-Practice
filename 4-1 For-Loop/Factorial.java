import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int i;
        int factor = 1;

        for(i=1;i<=number;i++){
            factor = factor * i;
        }
        
        System.out.println(factor);
        
    }
}

/*
    for(i=1;i<=number;i++){ }
    
    1. Initialisation: i=1;
    This part initialises the loop variable i to 1. It's executed only once, at the beginning of the loop.
    2. Condition: i<=number;
    The loop will continue to execute as long as this condition is true. Here, it checks whether i is less than or equal to number. If i is greater than number, the loop will stop.
    3. Increment: i++
    After each iteration of the loop, i++ is executed. This is an increment operation, which increases the value of i by 1. It's a shorthand for i = i + 1;.
    4. The Loop Body: { ... }
    The code inside the curly braces {} is the body of the loop. This is the code that will be executed repeatedly as long as the condition i <= number is true.
 */