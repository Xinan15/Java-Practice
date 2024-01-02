## 1. What distinguishes interpretation from compilation? 

### Interpretation
The interpreter executes the program directly from the source code, translating it line-by-line into machine code as the program runs. It does not produce an intermediate executable file.

### Compilation
The compiler converts the entire source code into a standalone executable file (machine code) before the program is run. This file can then be executed independently of the compiler.

### Java
Java uses a hybrid approach.<br> Its source code is compiled into bytecode, which is then either interpreted or further compiled at runtime by the Java Virtual Machine (JVM), providing a balance of platform independence and performance.
User

## 2. '=' and '=='
### '=' Assignment Operator
This operator is used to assign a value to a variable. <br>
For example, int a = 5; assigns the value 5 to the variable a.
### '==' Equality Operator
This operator is used to compare two values for equality. <br>
It returns true if the values are equal and false otherwise. <br>
For example, if (a == 5) checks whether the value of a is equal to 5.

## 3. How to investigate compilation errors:
Compilation errors occur when the code violates the syntax rules of the language.
1. Carefully read the error messages provided by the compiler, which usually indicate the location (line number) and nature of the error.
2. Check for common mistakes like missing semicolons, mismatched brackets, typos in variable names or keywords, and incorrect use of operators.
3. Use an Integrated Development Environment (IDE) with syntax highlighting and code analysis features to easily spot and correct errors.

## 4. Differences Between Floating-Point and Integer Types
### Integer Types
These represent whole numbers, both positive and negative. <br>
They do not contain any fractional or decimal components. <br>
Examples include <strong>int</strong>, <strong>long</strong>. They are both primitive data types used for storing integer numbers, but they differ in their size and the range of values they can hold.
### Floating-Point Types
These represent numbers with fractional parts (decimals). They are used when more precision is required, like in scientific calculations. Examples include <strong>float</strong> and <strong>double</strong> in Java.<br>
The main difference lies in their ability to represent numbers with precision and range.
## 5. Converting int to double and double to int in Java:
### Int to Double
```
int n = 5;
double n = (double) n;
// n would be 5.0.
```
### Double to Int
```
double n = 9.99;
int n = (int) n;
// n would be 9
// the fractional part is truncated/discarded during the conversion.
```
