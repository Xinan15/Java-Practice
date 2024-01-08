import java.util.ArrayList; // import the ArrayList class

class Main {

    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>(); 
        // Create an ArrayList object
        // 'ArrayList<String> cars' declares a variable named 'cars', which will be an 'ArrayList' storing objects of type 'String'.
        // 'cars' is the name of the variable.
        // 'new ArrayList<String>()' is the instantiation of the ArrayList, the list is initially empty.
        
        // Add Items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Access an Item
        cars.get(0);
        System.out.println(cars.get(0));

        // Change an Item
        // To modify an element, use the set() method and refer to the index number:

        cars.set(0, "Opel");
        System.out.println(cars.get(0));

        // Remove an Item
        // To remove an element, use the remove() method and refer to the index number:
        cars.remove(0);
        System.out.println(cars);

        cars.size();
        System.out.println(cars.size());

        // To remove all the elements in the ArrayList, use the clear() method:
        cars.clear();
        System.out.println(cars);

        // ArrayList Size
        // To find out how many elements an ArrayList have, use the size method:
        
        cars.size();
        System.out.println(cars.size());

    }

}