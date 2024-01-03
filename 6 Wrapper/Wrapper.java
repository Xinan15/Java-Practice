public class Wrapper {

    // Java Wrapper Classes: a way to use primitive data types (int, boolean, etc..) as objects.
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);

    System.out.println();

    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());


    System.out.println();

    String myString = myInt.toString();
    System.out.println(myString.length());

  }
}