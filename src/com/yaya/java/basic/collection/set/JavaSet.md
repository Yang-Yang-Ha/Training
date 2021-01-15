# Set Interface
Set Interface in Java is present in java.util package. 
It extends the Collection interface. 
It represents the unordered set of elements which doesn't allow us to store the duplicate items. 
We can store at most one null value in Set. 
Set is implemented by HashSet, LinkedHashSet
SortedSet extends Set.
NavigableSet extends SortedSet and TreeSet implement SortedSet. 

## HashSet
HashSet class implements Set Interface. It represents the collection that uses a hash table for storage.

## LinkedSet?
LinkedHashSet class represents the LinkedList implementation of Set Interface.
It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. 
It maintains the insertion order and permits null elements.

# SortedSet
SortedSet is the alternate of Set interface that provides a total ordering on its elements. 
The elements of the SortedSet are arranged in the increasing (ascending) order. 
The SortedSet provides the additional methods that inhibit the natural ordering of the elements.

## TreeSet
Java TreeSet class implements the Set interface that uses a tree for storage.
Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. 
The elements in TreeSet stored in ascending order.