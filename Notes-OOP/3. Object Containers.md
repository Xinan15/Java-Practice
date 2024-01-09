## Object Containers

### Array

An array holds a `fixed` number of values of a single type. The `size cannot be changed`.<br>

If you want to add/remove elements to/from an array, you have to create a new one.<br>

All elements of the array are stored in a contiguous memory location.<br>

Arrays are indexed, each element can be accessed using its index number.

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

### ArrayList

The ArrayList is `resizable array`, Elements can be added or removed.

```java
ArrayList<Integer> numbers = new ArrayList<>();

  numbers.add(10);
  numbers.add(20);
  numbers.add(30);
  
  System.out.println("Element at index 0: " + numbers.get(0));

  int size = numbers.size();
  System.out.println("ArrayList size: " + size); 
```

The elements in an `ArrayList` are `not` stored continuously in memory.<br>

### Time Complexity of ArrayList Operations

- Access: `O(1)` - Direct index access.
- Add/Remove at End: `O(1)` 
- Insert/Remove at an Arbitrary Position: `O(n)`
- Size: `O(1)` - Returns the number of elements.

## Time Complexity & Space Complexity

### Time Complexity

It measures the amount of `time` an algorithm takes to complete as a function of the length of the input. It's often expressed using Big `O` notation, the "O" stands for "Order of", e.g., O(n), O(log n).

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
