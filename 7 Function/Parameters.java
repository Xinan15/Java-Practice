public class Parameters {


    // Information can be passed to methods as parameter. 
    // Parameters act as variables inside the method.

    static void myMethod(String fname) {

        // This method takes a 'String' called 'fname' as parameter.
        // When the method is called, we pass along a first name, which is used inside the method to print the full name

        System.out.println(fname + " Refsnes");
    }

    public static void main(String[] args) {

        // When a parameter is passed to the method, it is called an argument. 
        // 'fname' is a parameter, while 'Liam', 'Jenny' and 'Anja' are arguments.
        
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}

/*
    Output:
    Liam Refsnes
    Jenny Refsnes
    Anja Refsnes
 */
