import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        switch (type){

            case 1:
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Good evening");
                break;
            case 4:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("What?");
                break;
        }
    }
    
}
