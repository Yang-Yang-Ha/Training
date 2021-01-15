# Reader
Java Reader is an abstract class for reading character streams. 
The only methods that a subclass must implement are read(char[], int, int) and close(). 
Most subclasses, however, will override some of the methods to provide higher efficiency, additional functionality, or both.

## Method
abstract void	close()	It closes the stream and releases any system resources associated with it.  
void	mark(int readAheadLimit)	It marks the present position in the stream.  
boolean	markSupported()	It tells whether this stream supports the mark() operation.  
int	read()	It reads a single character.  
int	read(char[] cbuf)	It reads characters into an array.  
abstract int	read(char[] cbuf, int off, int len)	It reads characters into a portion of an array.  
int	read(CharBuffer target)	It attempts to read characters into the specified character buffer.  
boolean	ready()	It tells whether this stream is ready to be read.  
void	reset()	It resets the stream.  
long	skip(long n)	It skips characters.  

## BufferedReader
Java BufferedReader class is used to read the text from a character-based input stream. 
It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.

### Method
String readLine()	It is used for reading a line of text.

## CharArrayReader
The CharArrayReader is composed of two words: CharArray and Reader. 
The CharArrayReader class is used to read character array as a reader (stream). 
It inherits Reader class.
