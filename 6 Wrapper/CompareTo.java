public class CompareTo {

    public static void main(String[] args) {

        // Consider two strings: String a = "Apple"; String b = "Banana";

        // The compareTo method is a feature of the String class, not of primitive types.
        String a = "A";
        String b = "B";
        // The Unicode value of 'A' is 65, and 'B' is 66.

        // Note:
        // char letter = 'A'; single quote
        // String name = "John"; double quotes

        System.out.println(a.compareTo(b));
        // 65 (A) - 66 (B), which is -1.

    }

}
