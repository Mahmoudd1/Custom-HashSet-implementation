# Custom HashSet Implementation
This is a custom implementation of the HashSet data structure in Java. The HashSet is designed to store a collection of unique integer values.

## Implementation Details
The custom myHashSet class is implemented using an array of linked lists, where each linked list represents a bucket.
The number of buckets is determined as 100 in this implementation. The elements are distributed into buckets based on their hash code.

**The add() method**: adds an element to the set by calculating the hash code of the element and determining the appropriate bucket. 
If the bucket is not empty, the element is appended to the linked list at the end. If the bucket is empty, a new linked list is created with the element as its head.

**The remove() method** :removes an element from the set by searching for it in the appropriate bucket. 
If the element is found, it is removed from the linked list. If the element is the head of the linked list, the head is updated to the next element.

**The contains() method**: checks if an element exists in the set by searching for it in the appropriate bucket. 
If the element is found in the linked list, the method returns true; otherwise, it returns false.

## Usage
To use the myHashSet class, follow the steps below:

Create an instance of the myHashSet class:

```java
myHashSet set = new myHashSet();
```
Add elements to the set using the add() method:

``` java
set.add(5);
set.add(10);
set.add(15);
```

Remove elements from the set using the remove() method:

``` java
set.remove(10);
```
Check if an element exists in the set using the contains() method:

``` java
boolean exists = set.contains(5);
```

## Complexity Analysis
The add() method:

In the average case, the time complexity of adding an element to the set is O(1) since it involves calculating the hash code and inserting the element at the end of a linked list.
In the worst case, when there are many collisions, the time complexity of adding an element can be up to O(n), where n is the number of elements in LinkedList.
The space complexity of adding an element is O(1).
The remove() method:

In the average case, the time complexity of removing an element from the set is O(1) since it involves searching for the element in the linked list and updating the pointers.
In the worst case, when the element is at the end of the linked list or does not exist, the time complexity can be up to O(n), where n is the number of elements in the LinkedList.
The space complexity of removing an element is O(1).
The contains() method:

In the average case, the time complexity of checking if an element exists in the set is O(1) since it involves searching for the element in the linked list.
In the worst case, when the element is at the end of the linked list or does not exist, the time complexity can be up to O(n), where n is the number of elements in the LinkedList.
The space complexity of checking if an element exists is O(1).
## limitations 

The current implementation supports only integer values.
Feel free to modify the implementation and customize it based on your specific requirements.

Note: This is a simplified implementation and may not have all the features and optimizations of the standard Java HashSet class.
