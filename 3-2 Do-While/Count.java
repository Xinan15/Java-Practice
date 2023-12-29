import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;

        // Handle negative numbers by taking the absolute value
        int absNumber = Math.abs(number);

        do{
            absNumber = absNumber/10;
            count = count+1;
            
            // Display the values of the variables
            System.out.println("number: "+absNumber+", count: "+count);
        } while(absNumber>0);
        System.out.println(count);

    }
    
}
