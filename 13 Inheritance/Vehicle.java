// Java Inheritance (Subclass and Superclass)
// In Java, it is possible to inherit attributes and methods from one class to another.
// It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

// 1. subclass (child) - the class that inherits from another class
// 2. superclass (parent) - the class being inherited from

class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute (brand)

    // Protected: Accessible `within its package and by subclasses in other
    // packages`. Useful for inheritance.

    public void honk() { // Vehicle method (honk)
        System.out.println("Tuut, tuut!");
    }
}

// To inherit from a class, use the `extends` keyword.
// the Car class (subclass) inherits the attributes and methods from the Vehicle
// class (superclass):

class Car extends Vehicle {

    private String modelName = "Mustang"; // Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the
        // value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
