## When to Use `if-else` vs. `switch`

**`if-else` Usage:**
- **Complex Conditions**: For testing complex or range-based conditions. Example: `if (x < 10) {...}`.
- **Variable Conditions**: When conditions are variables or non-constant expressions.
- **Few Conditions**: More readable for a small number of conditions.
- **Non-integer Comparisons**: Ideal for comparing strings or objects. Example: `if (str.equals("Hello")) {...}`.

**`switch` Usage:**
- **Multiple Constant Conditions**: Best for comparing one variable against multiple constants. Example: `switch (day) { case MONDAY: ... case TUESDAY: ... }`.
- **Clarity with Many Cases**: More organized for many constant values, like enum cases.
- **Performance**: More efficient for a large number of conditions.
- **Default Case Handling**: Includes a `default` case for unexpected values.

**Important for `switch`:**
- **Use `break`**: Essential to prevent fall-through. Example: `switch (x) { case 1: ... break; case 2: ... break; }`.