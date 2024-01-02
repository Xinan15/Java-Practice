Understanding void as a function that returns a value
What happens when the actual parameters passed in are inconsistent with the function parameters?

What is the lifetime and scope of local variables?
What is a function declaration? What is a function definition?
When are function parameters passed by values, and when are pointers passed?

### Understanding `void` in Functions
`void` is a return type for functions that do not return a value. When a function is declared with a `void` return type, it means that after executing its code, it does not give back any value.

### Mismatched Actual and Formal Parameters
If the actual parameters in a function call do not match the function's defined parameters in type or number, the program will either fail to compile or result in a runtime error, depending on the language and specific circumstances.

### Lifetime and Scope of Local Variables
Local variables are variables defined within a function. They are created when the function is called and destroyed when the function exits. Their scope is limited to the function they are defined in, meaning they can only be accessed within that function.

### Function Declaration vs Definition
- **Function Declaration:** Declares the existence of a function and specifies its return type, name, and parameters (its signature), but does not provide the body of the function.
- **Function Definition:** Includes both the declaration and the actual body (code) of the function.

### Parameter Passing: Value vs Pointer
- **Pass by Value:** The actual value is passed, and changes made to the parameter inside the function do not affect the original value.
- **Pass by Pointer (or Reference):** The memory address of the variable is passed, allowing the function to modify the variable directly.

Understanding these concepts is crucial for effective programming and software development.