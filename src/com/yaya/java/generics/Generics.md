# Generics
The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. 
It makes the code stable by detecting the bugs at compile time.

## Advantage of Java Generics
1. Type-safe: We can hold only a single type of objects in generics. It doesn't allow to store other objects.
2. Type casting is not required.
3. Compile-Time checking.

## Wildcard In Java Generics
The ? (question mark) symbol represents the wildcard element. It means any type. 
If we write <? extends Number>, it means any child class of Number.
We can use a wildcard as a type of a parameter, field, return type, or local variable. 
However, it is not allowed to use a wildcard as a type argument for a generic method invocation, 
a generic class instance creation, or a supertype.

### Upper Bounded Wildcards(? extends Class)
The purpose of upper bounded wildcards is to decrease the restrictions on a variable. 
It restricts the unknown type to be a specific type or a subtype of that type. 

### UnBounded Wildcards(?)
The unbounded wildcard type represents the list of an unknown type such as List<?>. This approach can be useful in the following scenarios: -

1. When the given method is implemented by using the functionality provided in the Object class.
2. When the generic class contains the methods that don't depend on the type parameter.

### Lower Bounded Wildcards(? super Class)
The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype of that type. 
Lower bounded Generics can't be used as a method's parameter. 