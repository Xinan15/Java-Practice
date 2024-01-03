### `void` in Functions
`void` is a return type for functions, it means that after executing its code, it does not give back any value.

### Mismatched Actual and Formal Parameters
In Java, if the actual arguments passed to a method don't match the method's parameters in type, number, or order, it results in a `compile-time error`. 
<br>

This is because Java is a statically typed language, requiring exact matches in method calls for:

1. **Type**: Argument types must match parameter types.
2. **Number**: The number of arguments must be the same as the number of parameters.
3. **Order**: Arguments must be in the same order as the parameters.

### Lifetime and Scope of Local Variables
Local variables are variables defined within a function.<br>

They are created when the function is called and destroyed when the function exits.<br>

Their scope is limited to the function they are defined in, meaning they can only be accessed within that function.

### Function Declaration vs Definition
<!-- ? -->
- **Function Declaration:** Declares the existence of a function and specifies its return type, name, and parameters (its signature), but does not provide the body of the function.
- **Function Definition:** Includes both the declaration and the actual body (code) of the function.

### Parameter Passing: Value vs Pointer
<!-- ? -->
- **Pass by Value:** The actual value is passed, and changes made to the parameter inside the function do not affect the original value.
- **Pass by Pointer (or Reference):** The memory address of the variable is passed, allowing the function to modify the variable directly.