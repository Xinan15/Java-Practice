## Encapsulation
Encapsulation is to make sure that <strong>"sensitive" data is hidden from users</strong>.<br>
1. declare class variables/attributes as `private`<br>
`private variables` can only be accessed within the same class
2. provide `public` `get/getter` and `set/setter` methods to access and update the value of a `private` variable

### Why Encapsulation?
- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

### Key aspects of encapsulation:
1. **Data Hiding**: Encapsulation enables the hiding of the internal state of the object from the outside. 
2. **Controlled Access**: By providing methods for accessing and modifying data, a class can control what is passed to and from its variables.
3. **Ease of Maintenance**: Encapsulated code is more modular and easier to change or extend.

#### Functions of the Several Access Modifiers of Objects

Access modifiers in Java determine the visibility of classes, methods, and variables. The main access modifiers are:

1. **Private**: The member is only accessible within its own class. Used for internal workings of the class that should not be exposed.

2. **Default** (No modifier): The member is accessible within classes in the same package. It's a balance between accessibility and encapsulation.

3. **Protected**: The member is accessible within its own package and by subclasses in other packages. Useful for inheritance.

4. **Public**: The member is accessible from any other class. Typically used for public interfaces of the class, like certain methods or constructors.

#### Functions of Static

The `static` keyword in Java has several functions:

1. **Static Variables**: 
   - Belong to the class, not instances of the class (i.e., objects).
   - Only one copy exists, shared by all instances of the class.
   - Useful for constants or properties that should be common to all objects.

2. **Static Methods**:
   - Can be called without creating an instance of the class.
   - Typically used for utility or helper methods that do not require any object state.
   - Cannot access instance variables or instance methods directly; they can only call other static methods or access static variables.

3. **Static Blocks**:
   - Used for static initialization of a class.
   - Executes when the class is loaded into memory.
   - Often used to initialize static variables.

4. **Static Classes** (Inner Classes):
   - Can be declared within a class but act as a top-level class.
   - Useful for grouping classes that are only used in one place, increasing encapsulation.

Overall, `static` is used to create components that are not tied to specific instances of a class but rather to the class itself.