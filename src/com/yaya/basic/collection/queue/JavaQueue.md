# Queue Interface
Queue interface maintains the first-in-first-out order.
It can be defined as an ordered list that is used to hold the elements which are about to be processed.
There are various classes like PriorityQueue which implements Queue.
Methods:
1. add(E e): boolean; Inserts the specified element into this queue 
if it is possible to do so immediately without violating capacity restrictions,
returning true upon success and throwing an IllegalStateException 
if no space is currently available.
2. element():E ;Retrieves, but does not remove, the head of this queue.  This method
differs from peek only in that it throws an exception
if this queue is empty.
3. offer(E e): boolean; Inserts the specified element into this queue if it is possible to do
so immediately without violating capacity restrictions.
When using a capacity-restricted queue, this method is generally
preferable to add, which can fail to insert an element only
by throwing an exception.
4. peek(): E; Retrieves, but does not remove, the head of this queue,
or returns null if this queue is empty.
5. poll(): E;Retrieves and removes the head of this queue, or returns null if this queue is empty.
6. remove: E; Retrieves and removes the head of this queue.  This method differs
from poll only in that it throws an exception if this queue is empty.


## Priority Queue
The PriorityQueue class implements the Queue interface. 
It holds the elements or objects which are to be processed by their priorities.
PriorityQueue doesn't allow null values to be stored in the queue.
It also uses a dynamic array to store data.

# Deque
Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. 
Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
ArrayDeque and LinkedList which implements the Deque interface.

## ArrayDeque
ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. 
Unlike queue, we can add or delete the elements from both the ends.
ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
It also uses a dynamic array to store data.