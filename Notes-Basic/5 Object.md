What is the difference between unicode and ascii?
What is the use of package type?
When comparing strings, what is the difference between == and equal?
What rules does the string compareTo function use to determine the size?
What is the function of string indexOf?


### Difference Between Unicode and ASCII
- **Unicode** is a character encoding standard that represents almost all of the written languages of the world. It uses a variable byte size, allowing it to encompass a much larger range of characters than ASCII.
- **ASCII** (American Standard Code for Information Interchange) is an older character encoding standard using 7 bits to represent characters, limited mostly to English letters, digits, and some special characters.

### Use of Package Type in Java
Package types in Java (like `Integer`, `Character`, `Boolean`, etc.) are classes that wrap primitive data types, providing additional methods and enabling use in contexts where objects are required, such as collections.

### Comparing Strings: `==` vs `equals()`
- **`==` Operator:** Checks for reference equality, i.e., whether two string references point to the same object in memory.
- **`equals()` Method:** Compares the actual content of the strings, character by character.

### String `compareTo` Function
The `compareTo` method in Java compares two strings lexicographically (based on the Unicode value of each character). If the strings are different, it returns a positive or negative value (the difference of the Unicode values of the first differing characters). If the strings are identical, it returns 0.

### Function of `indexOf` in String
`indexOf` in a string returns the index of the first occurrence of a specified character or substring. If it's not found, it returns -1.
