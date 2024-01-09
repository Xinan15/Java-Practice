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

### Access Modifiers

Access modifiers in Java determine the visibility of classes, methods, and variables.

1. **Private**: Accessible only `within its own class`. For internal class workings.
2. **Default**: Accessible `within the same package`. No explicit modifier.
3. **Protected**: Accessible `within its package and by subclasses in other packages`. Useful for inheritance.
4. **Public**: Accessible `from any class`. Used for public class interfaces.

### `Static` in Java
<strong>`Static`means: belonging to the class.</strong><br>

<strong>An `instance`field belongs to object of the class.</strong>

1. **Static Variables**:
   - Belong to the class, not individual objects.
   - Single copy shared across all class instances.
   - Ideal for class-wide constants or shared properties.

2. **Static Methods**:
   - Invokable without an object instance.
   - Suited for utility or helper functions independent of object state.
   - Limited to accessing other static methods and variables.

3. **Static Blocks**:
   - For class-level initialization.
   - Executes once when the class is loaded.
   - Commonly initializes static variables.

4. **Static Inner Classes**:
   - Nested within a class but function like a separate class.
   - Enhances encapsulation for classes used in limited scopes.
