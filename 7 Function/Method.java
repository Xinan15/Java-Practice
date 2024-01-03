public class Method {

    // A Java Method/Functionis a block of code which only runs when it is called.
    // You can pass data, known as parameters, into a method.
    // Why use methods? To reuse code: define the code once, and use it many times.
    // A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    // 'myMethod()' is the name of the method
    // 'static' means that the method belongs to the Main class and not an object of the Main class.
    // 'void' means that this method does not have a return value. 
    // to call a method in Java, write the method's name followed by two parentheses () and a semicolon;

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
