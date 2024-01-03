## Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with `square brackets []`.<br>
To insert values to it, you can place the values in `a comma-separated list`, inside `curly braces {}`.

```java
String[] cars;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// declared a variable that holds an array of strings
```

To create an array of integers, you could write:

```java
int[] myNum = {10, 20, 30, 40};
// eclared a variable that holds an array of integers
```

### Access the Elements of an Array

You can access an array element `by referring to the index number`.

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```

<strong>Note</strong>: Array indexes start with 0:<br>[0] is the first element. [1] is the second element, etc.

### Change an Array Element

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs 'Opel' instead of 'Volvo'
```

### Array Length

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```

Let's break down these concepts for clarity:

## Characteristics of Arrays

- **Continuous Memory Allocation**<br>
  Arrays store elements in contiguous memory addresses.
- **Uniform Element Size**<br>
  Each element in an array occupies an equal amount of space.
  <br>For example, in an array of `int` (assuming `int` is 4 bytes), every element occupies 4 bytes of memory.
- **Efficient Element Access**<br>
  Given the address of the first element and the array index, you can calculate the memory address of any element.<br>
  This allows for quick and efficient location and retrieval of elements.

## Multi-Dimensional Arrays

Multidimensional arrays are useful when you want to store data as a `tabular` form, like a table with `rows and columns`.

To create a two-dimensional array, add each array within its own set of `curly braces {}`:

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```

### Access Elements

To access the elements of the myNumbers array, specify two indexes: `one for the array, and one for the element inside that array`.

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]);
// Outputs 7
// This example accesses the third element (2) in the second array (1) of myNumbers:
```

**Remember that:** Array indexes start with 0:<br> `[0]` is the first element. `[1]` is the second element, etc.

### Change Element Values

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]);
// Outputs 9 instead of 7
```

### Loop Through a Multi-Dimensional Array

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
```