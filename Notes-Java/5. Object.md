## Unicode and ASCII
Both are two popular encoding schemes / character sets.
#### **Unicode**
Unicode is a universal character set that defines all characters, punctuations, and symbols in the world.<br>
It enables processing, storage, and transport of text independent of platform and language on computers.
<br>
It uses a variable byte size, allowing it to encompass a much larger range of characters than ASCII.<br>
For example: In Unicode, the character 'A' is represented as U+0041.<br>

#### **ASCII**
ASCII stands for the "American Standard Code for Information Interchange".<br>
ASCII is a 7-bit character set containing 128 characters.<br>
It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters.<br>
Example: In ASCII, the character 'A' is represented as 65 (decimal).


## Wrapper Classes
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
<br>
Wrapper classes enable use in contexts where objects are required, such as collections.

| Primitive Data Type | Wrapper Class |
|----------|:--------:|
| short| Short| 
| int| Long| 
| long| Byte| 
| float| Float| 
| double| Double| 
| boolean| Boolean| 
| char| Character| 

	
Sometimes you must use wrapper classes, for example:
```java
ArrayList<int> myNumbers = new ArrayList<int>(); 
// Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); 
// Valid
```
## Comparing Strings: `==` vs `equals()`
- **`==` Operator:** <br>
In Java, "==" is used for reference equality, which means that it checks whether two objects refer to the same `memory location`.<br>

- **`equals()` Method:** <br>Compares the actual `content` of two objects.

## String `compareTo` Function
The compareTo method in Java compares two strings based on the `Unicode values` of their characters.<br>
It's done lexicographically, which is somewhat like dictionary order, but it's `based on the Unicode value` (numerical representation) of each character.<br>If the strings are different, it returns a positive or negative value (the difference of the Unicode values of the first differing characters).<br> If the strings are identical, it returns 0.

### Function of `indexOf` in String
The indexOf() method returns the position of the first occurrence of specified character(s) in a string.<br>
If it's not found, it returns -1.
