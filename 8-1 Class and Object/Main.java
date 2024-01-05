    
    // 'public class Main{}': meaning the class is accessible from any other class in any package.
    // 'class Main{}': meaning the class has package-private access by default. This means it's only accessible within its own package.

class Main {
    // created a package-private class named 'Main'

    int x = 5;
    // created an instance: variable x:

    /*
        1. class should always start with an uppercase first letter
        2. the name of the java file should match the class name.
     */

    public static void main(String[] args) {

        /*
            'public static void main(String[] args) {}': this line is the main method, it is the entry point of any Java program
         */

        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        // created objects named 'myObj1' and 'myObj2' of the Main class.

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        // Accessing the instance variable x by 'myObj1.x'
    }

}
