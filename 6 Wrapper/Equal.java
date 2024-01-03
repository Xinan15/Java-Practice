public class Equal {
    public static void main(String[] args) {

        // ==
        String s1 = "hello";
        String s2 = new String("hello");

        if (s1 == s2) {
            System.out.println("s1 and s2 are the same object");
        } else {
            System.out.println("s1 and s2 are different objects");
        }

        // equal
        String s3 = "hello";
        String s4 = new String("hello");

        if (s3.equals(s4)) {
            System.out.println("s3 and s4 have the same value");
        } else {
            System.out.println("s3 and s4 have different values");
        }

    }
}
