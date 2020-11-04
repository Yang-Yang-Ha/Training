# Introduce
List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.
In this interface, it has an extra method called sort than Collection.

## Subclasses
ArrayList, LinkedList, Vector, Stack(which extends Vector)

## ArrayList
The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. 
ArrayList is actually an Array, but we can add elements or remove elements from it. 

## LinkedList
LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
It can store the duplicate elements. It maintains the insertion order and is not synchronized.
In LinkedList, the manipulation is fast because no shifting is required.

## Difference between ArrayList and LinkedList
1) ArrayList internally uses a dynamic array to store the elements.	
LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. 
If any element is removed from the array, all the bits are shifted in memory.	
Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, 
so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	
LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data. 

## Vector
Vector uses a dynamic array to store the data elements. It is similar to ArrayList. 
However, It is synchronized and contains many methods that are not the part of Collection framework.

## Stack
The stack is the subclass of Vector. It implements the last-in-first-out data structure.
The stack contains all of the methods of Vector class and also provides its methods like boolean push(), 
boolean peek(), boolean push(object o), which defines its properties.
