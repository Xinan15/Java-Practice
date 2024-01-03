## `while` Loop vs. `for` Loop**

**`while` Loop:**
- **Use When**: Iteration count unknown/uncertain, focus on condition.
- **Example**: Reading a file until end: `while (file.hasNext()) {...}`.
- **Characteristics**: Single condition focus, no fixed iteration count.

**`for` Loop:**
- **Use When**: Iteration count known/fixed, involves counter variable. 
- **Example**: Counting numbers: `for (int i = 0; i < 10; i++) {...}`.
- **Characteristics**: Counter initialization, condition, increment/decrement in one line.

## Rounding and Remainders
- **Rounding**: Adjusting a number to the nearest integer.<br>Example: Rounding 3.6 to 4.
- **Remainders**: The leftover part in division. Obtained using `%`. <br>Example: `5 % 2` results in 1.

## `++i` vs `i++`
- **`++i` (Pre-increment)**: Increments then returns new value. <br>In `++i`, if `i` is 1, it becomes 2 and returns 2.
- **`i++` (Post-increment)**: Returns current value, then increments. <br>In `i++`, if `i` is 1, it returns 1 and then becomes 2.

## Short-Circuiting
- **AND (`&&`) Operator**: Stops if first condition is false.<br>Example: `(false && condition2)` stops at `false`.
- **OR (`||`) Operator**: Stops if first condition is true. <br>Example: `(true || condition2)` stops at `true`.
- **Efficiency**: Avoids unnecessary evaluations.
