public class Main {

    int x = 5;

    // created a class named "Main", with an instance variable x:

    /*
        1. class should always start with an uppercase first letter
        2. the name of the java file should match the class name.
     */

    public static void main(String[] args) {

        /*
            'public static void main(String[] args) {}'
            this line is the main method
            it is the entry point of any Java program
         */

        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        // creating objects of Main
        // Here, we create objects named 'myObj1' and 'myObj2' of the Main class.

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        // Accessing the instance variable x by 'myObj1.x'
    }

}
