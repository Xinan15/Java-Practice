// 'public' is an access modifier
// It means that the `class` or `method` is accessible from any other class.
// For a class, this means it can be instantiated from any other class; 
// for a method, it means the method can be called from any other class.

public class MultipleParameters {


    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {

        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }

    // The method call must have the same number of arguments as there are parameters, and must be passed in the same order.

}
