public class Return {

    // 1. 'void': Not return a value

    static void method1(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    // 2. Return Values
    // To return a value, you can use a primitive data type (such as int, char, etc.) instead of void
    // and use the return keyword inside the method

    static int method2(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        method1("Jenny", 8);

        System.out.println(method2(3, 5));

    }

}
