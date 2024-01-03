import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;

        // Handle negative numbers by taking the absolute value
        int absNumber = Math.abs(number);

        in.close();

        do{
            absNumber = absNumber/10;
            count = count+1;
            
            // Display the values of the variables
            System.out.println("number: "+absNumber+", count: "+count);
        } while(absNumber>0);
        System.out.println(count);

    }
    
}

/*
    The do-while loop is a control flow statement in Java that allows for the execution of a block of statements at least once, and then repeatedly as long as a specified condition remains true.
    
    do {
        // Statements to be executed
    } while (condition);

    1. Execute the do Block: First, the code inside the do block is executed. This happens without any initial condition check.
    2. Evaluate the Condition: After the do block is executed, the condition specified in the while clause is evaluated.
    3. Repeat or Exit:
        If the condition is true, the loop goes back to step 1, and the do block is executed again.
        If the condition is false, the loop ends, and the flow of control moves to the next statement after the do-while loop.
*/