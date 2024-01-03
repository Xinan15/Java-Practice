public class Multi {
    public static void main(String[] args) {
        // To create a two-dimensional array, add each array within its own set of
        // `curly braces {}`:
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        System.out.println(myNumbers[1][2]);
        // outputs 7
        System.out.println();

        // change the value
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);
        // outputs 9
        
        System.out.println();

        System.out.println("multdemision array length: "+myNumbers.length);
        System.out.println("Array 1 length: "+myNumbers[0].length);
        System.out.println("Array 2 length: "+myNumbers[1].length);
        
        System.out.println();

        // Loop Through a Multi-Dimensional Array
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
