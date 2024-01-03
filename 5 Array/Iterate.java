public class Iterate {

    // Loop Through an Array
    public static void main(String[] args) {

        // For loop:
        String[] cars1 = { "Volvo", "BMW", "Ford", "Mazda" };
        for (int i = 0; i < cars1.length; i++) {
            System.out.println(cars1[i]);
        }
        
        System.out.println();

        // For-Each:
        String[] cars2 = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars2) {
            System.out.println(i);
        }
    }

}
