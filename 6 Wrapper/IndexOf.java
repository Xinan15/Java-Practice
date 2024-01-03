public class IndexOf {


    // The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
    public static void main(String[] args) {

        String a = "Hello planet earth, you are a great planet.";
        
        System.out.println(a.indexOf("planet"));

        /* output: 6
        Index 0: 'H'
        Index 1: 'e'
        Index 2: 'l'
        Index 3: 'l'
        Index 4: 'o'
        Index 5: ' ' (a space character)
        The substring "planet" begins immediately after, at index 6.
        */

        System.out.println(a.indexOf("e", 5));

        /* output:10
        The character 'e' appears at index 1, 10, 13, 26, 32, and 40 
        Since the search starts at index 5, the first 'e' found is at index 10.
         */

        System.out.println(a.indexOf("1"));
        // If it's not found, it returns -1.

    }
}