# Map Introduction
A map contains values on the basis of key.
A Map is useful if you have to search, update or delete elements on the basis of a key.

## Method
1. V put(Object key, Object value)	It is used to insert an entry in the map.
2. void putAll(Map map)	        It is used to insert the specified map in the map.
3. V putIfAbsent(K key, V value)	It inserts the specified value with the specified key in the map only if it is not already specified.
4. V remove(Object key)	        It is used to delete an entry for the specified key.
5. boolean remove(Object key, Object value)	It removes the specified values with the associated specified keys from the map.
6. Set keySet()	                It returns the Set view containing all the keys.
7. Set<Map.Entry<K,V>> entrySet()	It returns the Set view containing all the keys and values.
8. void clear()	                It is used to reset the map.
9. V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
10. V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)	It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.
11. V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is present and non-null.
12. boolean containsValue(Object value)	This method returns true if some value equal to the value exists within the map, else return false.
13. boolean containsKey(Object key)	This method returns true if some key equal to the key exists within the map, else return false.
14. boolean equals(Object o)	It is used to compare the specified Object with the Map.
15. void forEach(BiConsumer<? super K,? super V> action)	It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
16. V get(Object key)	This method returns the object that contains the value associated with the key.
17. V getOrDefault(Object key, V defaultValue)	It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
18. int hashCode()	It returns the hash code value for the Map
19. boolean isEmpty()	This method returns true if the map is empty; returns false if it contains at least one key.
20. V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
21. V replace(K key, V value)	It replaces the specified value for a specified key.
22. boolean replace(K key, V oldValue, V newValue)	It replaces the old value with the new value for a specified key.
23. void replaceAll(BiFunction<? super K,? super V,? extends V> function)	It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
24. Collection values()	It returns a collection view of the values contained in the map.
25. int size()	This method returns the number of entries in the map.

## Map.Entry
Entry is the subinterface of Map. So we will be accessed it by Map.Entry name. 
It returns a collection-view of the map, whose elements are of this class. It provides methods to get key and value.

## HashMap
HashMap is the implementation of Map, but it doesn't maintain any order.
HashMap is a part of the Java collection framework. It uses a technique called Hashing. It implements the map interface. 
It stores the data in the pair of Key and Value. HashMap contains an array of the nodes, and the node is represented as a class. 
It uses an array and LinkedList data structure internally for storing Key and Value. 

### HashMap's Points To Remember
1. Java HashMap contains values based on the key.
2. Java HashMap contains only unique keys.
3. Java HashMap may have one null key and multiple null values.
4. Java HashMap is non synchronized.
5. Java HashMap maintains no order.
6. The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

### Hashing Technique?

## LinkedHashMap
LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.

### LinkedHashMap's Points To Remember
1. Java LinkedHashMap contains values based on the key.
2. Java LinkedHashMap contains unique elements.
3. Java LinkedHashMap may have one null key and multiple null values.
4. Java LinkedHashMap is non synchronized.
5. Java LinkedHashMap maintains insertion order.
6. The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

## SortedMap
SortedMap extends Map,

## TreeMap 
TreeMap is the implementation of Map and NavigableMap(extends SortedMap). It maintains ascending order.
HashMap and LinkedHashMap use array data structure to store nodes,
but the TreeMap uses a data structure called Red-Black tree.

### Red-Black Tree(To do)