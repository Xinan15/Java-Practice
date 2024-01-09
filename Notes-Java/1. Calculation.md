# Calculation

## Compiled and interpreted programming languages

Based on `how they are processed`, programming languages can be broadly categorized into two types: `compiled` and `interpreted`.

### Compiled Programming Languages

Compiled programming languages are those in which the source code is compiled into machine code before it is executed.<br>

Machine code is a low-level language that can be executed directly by the computer’s CPU.<br>

When a program written in a compiled language is compiled, the source code is converted into an executable file that can be run on the target machine.<br>

Examples: C, C++, and Go.

### Interpreted Programming Languages

Interpreted programming languages are those in which the source code is executed directly by an interpreter, without being compiled into machine code first. <br>

The interpreter reads the source code line by line and executes each line as it is read. The interpreter is responsible for translating the source code into machine code at runtime.<br>

When you write code in an interpreted language, you can typically run it directly from the command line or from an IDE without the need for a separate compilation step.<br>

Examples: Python, Ruby, and JavaScript.

### Java

Java can be considered both a compiled and an interpreted language.<br>

Its source code is first compiled into a binary intermediate form called bytecode, is not machine instructions and not tied to any particular computer architecture. <br>

This byte-code runs on the Java Virtual Machine (JVM), which interprets this bytecode and executes it.

Certainly, here's a more concise explanation:

### .java Files
- These are Java source code files.
- Contain human-readable code written by programmers.
- Input for the Java compiler (`javac`).
- `.java` files are where you write your program,

### .class Files**:
- Result from compiling `.java` files.
- Contain Java bytecode, not human-readable.
- Executed by the Java Virtual Machine (JVM).
- `.class` files are what the computer uses to run the program.

## '=' and '=='

### '=' Assignment Operator

To assign a value to a variable.

```java
int a = 5
// assigns the value 5 to the variable a
```

### '==' Equality Operator

To compare two values for equality. <br>
It returns true if the values are equal and false otherwise. <br>

```java
if (a == 5)
// checks whether the value of a is equal to 5
```

## Compilation errors

Compilation errors occur when the code violates the `syntax` rules of the language.

1. Carefully read the error messages provided by the compiler, which usually indicate the location (line number) and nature of the error.
2. Check for common mistakes like missing semicolons, mismatched brackets, typos in variable names or keywords, and incorrect use of operators.
3. Use an Integrated Development Environment (IDE) with syntax highlighting and code analysis features to easily spot and correct errors.

## Float and Integer

### Integer

To store whole numbers without any fractional or decimal part.<br>

Do not contain any fractional or decimal components. <br>

Examples: `int`, `long`. They are both used for storing integer numbers, but they differ in their size and the range of values they can hold.

### Float

To store fractional numbers, including decimals.<br>

Examples include `float` and `double` in Java, with different ability to represent numbers with precision and range.

## Java `/` Division

### Integer Division
   - Result is an integer.
   - Fractional part is `truncated`.
   - Example: `5 / 2` results in `2`.

### Floating-Point Division
   - Result is a floating-point number.
   - Retains decimal values.
   - Example: `5.0 / 2` or `5 / 2.0` results in `2.5`.
   - The result is not automatically rounded.
## Type Casting

**From Integer to Float/Double (Widening Casting)**

```java
int myInt = 9;
double myDouble = myInt;
// Automatic casting: int to double
// myDouble would be 9.0
```

**From Double to Integer (Narrowing Casting)**
```java
double myDouble = 9.78;
int myInt = (int) myDouble;  
// Manual casting: double to int
// myInt would be 9
// the fractional part is truncated/discarded
```