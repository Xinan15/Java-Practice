import java.util.Scanner;

public class CountingLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 100;
        while(count >0){
            System.out.println(count);
            count=count-1;
        }
        System.out.println(count);
        System.out.println("Launch");

        in.close();
    }
}
