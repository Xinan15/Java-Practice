## Return Values
### Not to return any value
`void` is a return type for functions, it means that after executing its code, it does not give back any value.
### To return a value
If you want the method to return a value, you can use a `primitive data type` (such as `int`, `char`, etc.) instead of void, and use the return keyword inside the method.

## Parameters vs Arguments vs Local Variables

### Parameters / Formal Parameters
These are the variables declared by a method that receive values when the method is called.<br>

They are listed in the method definition and act as placeholders for the values (or references to objects) that will be passed to the method when it is called.

```java
public void greet(String message) {
    System.out.println(message);
// Here, 'message' is a formal parameter.
}
```

### Arguments / Actual Parameters
These are the `real values` or references to objects passed to the method when it is called.<br>

```java
greet("Hello, World!");
// Here, "Hello, World!" is an actual parameter
```

### Local Variables
Local variables are variables `defined within a function`.<br>

They are created when the function is called and destroyed when the function exits, they can only be accessed within that function.<br>

They are used within the method to perform operations or temporarily hold data.<br>

### Mismatched Parameters and Arguments
In Java, if the actual arguments passed to a method don't match the method's parameters in type, number, or order, it results in a `compile-time error`. 
<br>
Java is a statically typed language, requiring exact matches in method calls for:

1. `Type`: Argument types must match parameter types.
2. `Number`: The number of arguments must be the same as the number of parameters.
3. `Order`: Arguments must be in the same order as the parameters.

## Method Declaration vs Definition
### Declaration
A Java function is declared by specifying its signature.<br>

This includes the `access modifier` (like public, private), the `return type`, the `method name`, and any `parameters` it takes.<br>

It tells the compiler and other parts of the program what the method looks like, but not how it works.

```java
public int addNumbers(int a, int b);
/*
    This line declares:
    1. A method named addNumbers
    2. This method takes two integers as parameters
    3. This method returns an integer
*/
```

33333 cDefinition
In Java, the method definition includes the `declaration plus the body` (enclosed in braces {}) that contains the code to be executed when the method is called.<br>

```java
public int addNumbers(int a, int b) {
    return a + b;
}
// This defines how the addNumbers method works, 
```


### pointers
In Java, the concept of pointers (from languages like C or C++) doesn't exist in the same form. <br>Instead, Java uses references, not pointers.