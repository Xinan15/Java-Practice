## Java Abstraction
`Data abstraction` is the process of hiding certain details and showing only essential information to the user.<br>

Abstraction can be achieved with either `abstract classes` or `interfaces`.<br>

The `abstract keyword` is a non-access modifier, used for classes and methods:

- `Abstract class`: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

- `Abstract method`: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

## Java Interface
An interface is a completely `abstract class` that is used to group related methods with empty bodies.

- Like abstract classes, interfaces cannot be used to create objects.
- Interface methods do not have a body - the body is provided by the "implement" class.
- On implementation of an interface, you must override all of its methods.
- Interface methods are by default abstract and public
Interface attributes are by default public, static and final.
- An interface cannot contain a constructor (as it cannot be used to create objects).

Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).


 Week 6 Abstraction and Interfaces
What is the difference between java interface and inheritance?
 




 Certainly, let's include 'abstraction' in the comparison:

1. **Inheritance**:
   - For creating a new class based on an existing class.
   - The new class inherits features from the existing one.
   - It's an "is-a" relationship (e.g., a Car is a Vehicle).

2. **Interface**:
   - A contract for what a class can do, with abstract methods.
   - Classes can implement multiple interfaces.
   - It's a "can-do" relationship (e.g., a Car can Drive).

3. **Abstraction**:
   - Used to hide complex implementation details and show only the necessary features.
   - Can be achieved using abstract classes or interfaces.
   - It's about providing a simple interface to complex systems (e.g., a Vehicle can start, but how it starts is hidden).

Key Points:
- Inheritance extends a class's functionality.
- Interfaces enable different classes to implement the same set of behaviors.
- Abstraction simplifies interaction with complex systems by hiding the detailed workings.


Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.

Note: Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter.




What is the difference between entity class and abstract class?

