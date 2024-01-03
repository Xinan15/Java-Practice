
Week 1 Classes and Objects
What is a class? What is an object?
What is the difference in scope and life cycle between local variables and object member variables?



## 1. What is a class? What is an object?
### Class
In Java, a class is a blueprint for creating objects.<br>
It defines a datatype by bundling data and methods that operate on the data into a single unit.<br>
A class can contain fields (variables), methods (functions), constructors, blocks, nested class, and interface.<br>
For example, a <strong>Car</strong> class in Java might have fields like <strong>colour</strong> and <strong>brand</strong>, and methods like <strong>drive()</strong> and <strong>brake()</strong>.
### Object
An object is an instance of a class.<br>
When a class is defined, no memory is allocated until an object of that class is created using the new keyword.<br>
 The object has its own state (attributes or properties) and behaviour (methods).
 <br>
 For instance, if you create an instance of the Car class (Car myCar = new Car();), myCar is an object with its own state (attributes like color, brand) and behaviors (methods).

## 2. What is the difference in scope and life cycle between local variables and object member variables?
Now, regarding the difference in scope and life cycle between local variables and object member variables:

Local Variables:

Scope: Local variables are declared within a method or block and can only be accessed within that method or block.
Life Cycle: The life cycle of a local variable is limited to the execution of the method or block. When the method completes or the block is exited, the local variable is destroyed.
Object Member Variables (Instance Variables):

Scope: Member variables are declared within a class but outside any method. They are accessible from any method within the class (and from outside the class based on their access modifiers).
Life Cycle: The life cycle of member variables is tied to the life cycle of the object. As long as the object exists, these variables exist and retain their values. When the object is destroyed (or becomes eligible for garbage collection), these variables are also destroyed.
In summary, local variables are temporary and limited to the scope of a method, while member variables are associated with an object's state and exist as long as the object exists.


Certainly! Here's an expanded and detailed format for your notes on Classes, Objects, and variable scopes in Java:

---

 Understanding Classes and Objects in Java**

**1. Classes and Objects**
   - **Class**
     - **Definition**: A blueprint for objects. Defines a datatype by bundling data and methods.
     - **Contents**: Can include fields (variables), methods (functions), constructors, blocks, nested classes, and interfaces.
     - **Example**: A `Car` class might have fields like `colour`, `brand`, and methods like `drive()` and `brake()`.

   - **Object**
     - **Definition**: An instance of a class, created using the `new` keyword.
     - **Characteristics**: Possesses its own state (attributes) and behaviour (methods).
     - **Example**: Creating a `Car` object (`Car myCar = new Car();`) means `myCar` has attributes (like color, brand) and behaviours (methods).

**2. Scope and Life Cycle of Variables**
   - **Local Variables**
     - **Scope**: Declared and accessible only within a method or block.
     - **Life Cycle**: Exist only during the execution of the method/block. They are destroyed once the method completes or block is exited.
     - **Example**: A variable declared inside a method `public void drive() { int speed = 0; ... }` is a local variable.

   - **Object Member Variables (Instance Variables)**
     - **Scope**: Declared within a class but outside any method. Accessible from any method within the class (subject to access modifiers).
     - **Life Cycle**: Tied to the object's existence. They persist as long as the object exists and are destroyed when the object is garbage collected.
     - **Example**: In a `Car` class, `private String colour;` is an instance variable.

**Key Insights**
   - Local variables are temporary and confined to the method's scope.
   - Member variables (Instance Variables) are linked to the object's lifecycle and define its state.

---

This format provides a comprehensive overview, detailing the concepts of classes and objects in Java, along with the differences in scope and life cycle between local and member variables.