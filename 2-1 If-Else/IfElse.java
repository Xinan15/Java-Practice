import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int max;

        if (x>y)
            max = x;
        else
            max = y;
        
        System.out.println(max);
        
        // In Java, an 'else' statement is always associated with the closest preceding 'if' statement 
    }
}
