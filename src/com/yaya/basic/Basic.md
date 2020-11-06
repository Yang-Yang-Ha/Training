## DataType
Data types are divided into two groups: <br/>
Primitive data type: byte, short, int, long, float, double, boolean and char <br/>
Non-primitive data type: String, Arrays, Classes called reference types <br/>
Data Type	Size	Description <br/>
byte	        1 byte	Stores whole numbers from -128 to 127 <br/>
short	    2 bytes	Stores whole numbers from -32,768 to 32,767 <br/>
int	        4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647 <br/>
long	        8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 <br/>
float	    4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits <br/>
double	    8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits <br/>
boolean	    1 bit	Stores true or false values <br/>
char	        2 bytes	Stores a single character/letter or ASCII values <br/>
The main difference between primitive and non-primitive data types are: <br/>
Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String). <br/>
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot. <br/>
A primitive type has always a value, while non-primitive types can be null. <br/>
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter. <br/>
The size of a primitive type depends on the data type, while non-primitive types have all the same size. <br/>

## JavaString
Java provides three classes to represent a sequence of characters: String, StringBuffer, and StringBuilder. <br/>
The String class is immutable whereas StringBuffer and StringBuilder classes are mutable. And the StringBuilder <br/>
class is introduced since JDK 1.5 <br/>
StringBuffer	StringBuilder <br/>
1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously. <br/>
StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously. <br/>
2)	StringBuffer is less efficient than StringBuilder.	StringBuilder is more efficient than StringBuffer. <br/>
 