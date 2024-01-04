## Object Containers
### Array
An array in Java is a basic data structure that holds a fixed number of values of a single type.<br>

The size of an array is determined at the time of creation and cannot be changed. <br>

Arrays are indexed, meaning each element can be accessed using its index number.
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```
### ArrayList
The ArrayList is a class in java.util package, which is a `resizable array`.

The size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).<br>

While elements can be added and removed from an ArrayList whenever you want. 
```java
import java.util.ArrayList; 

ArrayList<String> cars = new ArrayList<String>();

// Create an ArrayList object
```

### ArrayList Storage
An `ArrayList` in Java is stored continuously in memory.<br>

It's backed by a dynamic array, meaning all elements are in a contiguous memory location.

### Time Complexity of ArrayList Operations
- **Access**: `O(1)` - Direct index access.
- **Add/Remove at End**: `O(1)` - Amortized, but O(n) if resizing is needed.
- **Insert/Remove at an Arbitrary Position**: `O(n)` - Due to the shift of elements.
- **Size**: `O(1)` - Returns the number of elements.

## Time Complexity and Space Complexity
### Time Complexity
It measures the amount of `time` an algorithm takes to complete as a function of the length of the input. It's often expressed using Big O notation, the "O" stands for "Order of", e.g., O(n), O(log n).

### Space Complexity
It measures the amount of `memory` an algorithm needs in relation to the input size. Like time complexity, it's often expressed in Big O notation, considering both auxiliary space and space in input data.

<!-- ? -->
#### What Does Each Element in an Object Array Store?
- **Object Array Elements**: Each element in an object array in Java stores a reference to an object. These references point to the actual objects stored in heap memory.

<!-- ? -->
#### Time Complexity of Each Operation of the Hash Table? Does Hash Table Support Traversal?
- **Time Complexity of Hash Table Operations**:
  - **Access/Search**: Average O(1), Worst O(n) - Depends on the hash function and collision resolution.
  - **Insertion/Deletion**: Average O(1), Worst O(n) - Same as above.
- **Traversal in Hash Table**: Yes, hash tables support traversal, but the order of elements is not guaranteed as it depends on the hash function.

<!-- ? -->
#### Hash Conflict Problem
- **Hash Conflict**: Occurs when two different keys produce the same hash value, leading to a collision in a hash table. It's a common issue in hash-based structures.
- **Resolution Techniques**: Common techniques include separate chaining (using linked lists or another data structure at each hash) and open addressing (finding another slot using methods like linear probing, quadratic probing, or double hashing).

Understanding these concepts is crucial for efficient data handling and algorithm implementation in Java and other programming languages.