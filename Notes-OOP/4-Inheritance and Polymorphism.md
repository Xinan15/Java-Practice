## Inheritance
<strong>`functions/methods` and `parent classes/inheritance` are two powerful means of eliminating code duplication in programming.</strong>

Inheritance in Java is a mechanism where a new class, known as a subclass, is derived from an existing class, known as a superclass.<br>

The subclass inherits attributes and methods from the superclass, promoting code reuse.

## Connection between Access Modifiers and Inheritance
- **Public**: Methods and fields are accessible from `any class`.
- **Protected**: Methods and fields are accessible `within the same package or subclasses in different packages`.
**Private**: Methods and fields are only accessible `within the class` they are declared in.

A subclass can inherit only the `public` and `protected` members of its superclass. `private` members are not inherited.

## Upcasting
<!-- ? -->
Upward Transformation/Upcasting: is when a reference of a subclass is treated as a reference of its superclass. It's a way to generalize a subclass object.

Example:

```java
Animal myAnimal = new Dog();
// Here, a Dog object is referred to by an Animal reference.
```

<!-- ? -->
## Override vs Overload
### Override
Occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
Overload: Happens when two or more methods in one class have the same name but different parameters.
Override Example:

```java
class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird eats seeds");
    }
}
```
### Overload

```java
class Example {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String b) {
        System.out.println("String: " + b);
    }
}
```
