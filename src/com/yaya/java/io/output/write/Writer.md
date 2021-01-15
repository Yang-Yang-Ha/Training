# Writer
It is an abstract class for writing to character streams. 
The methods that a subclass must implement are write(char[], int, int), flush(), and close(). 
Most subclasses will override some of the methods defined here to provide higher efficiency, functionality or both.

## Method
Writer	append(char c)	It appends the specified character to this writer.  
Writer	append(CharSequence csq)	It appends the specified character sequence to this writer.    
Writer	append(CharSequence csq, int start, int end)	It appends a subsequence of the specified character sequence to this writer.  
abstract void	close()	It closes the stream, flushing it first.  
abstract void	flush()	It flushes the stream.  
void	write(char[] cbuf)	It writes an array of characters.  
abstract void	write(char[] cbuf, int off, int len)	It writes a portion of an array of characters.  
void	write(int c)	It writes a single character.  
void	write(String str)	It writes a string.  
void	write(String str, int off, int len)	It writes a portion of a string.  

## BufferedWriter
Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast. It inherits Writer class. 
The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.

## CharArrayWriter
The CharArrayWriter class can be used to write common data to multiple files. This class inherits Writer class. 
Its buffer automatically grows when data is written in this stream. 
Calling the close() method on this object has no effect.

## OutputStreamWriter
OutputStreamWriter is a class which is used to convert character stream to byte stream, the characters are encoded into byte using a specified charset.