public class LocalVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        addAndPrint(a, b);
    }

    public static void addAndPrint(int num1, int num2) {

        // 'num1' and 'num2' are parameters

        int sum = num1 + num2;
        String message = "The sum is: ";

        // 'sum' and 'message' are local variables

        // Print using local variables
        System.out.println(message + sum);
    }
}
