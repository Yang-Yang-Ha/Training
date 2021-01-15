# InputStream Class
1. public abstract int read()throws IOException	reads the next byte of data from the input stream. It returns -1 at the end of the file.
2. public int available()throws IOException	    returns an estimate of the number of bytes that can be read from the current input stream.
3. public void close()throws IOException	    is used to close the current input stream.

## FileInputStream
Java FileInputStream class obtains input bytes from a file. 
It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.

### Method
int available()	                        It is used to return the estimated number of bytes that can be read from the input stream.  
int read()	                            It is used to read the byte of data from the input stream.  
int read(byte[] b)	                    It is used to read up to b.length bytes of data from the input stream.  
int read(byte[] b, int off, int len)	It is used to read up to len bytes of data from the input stream.  
long skip(long x)	                    It is used to skip over and discards x bytes of data from the input stream.  
FileChannel getChannel()	            It is used to return the unique FileChannel object associated with the file input stream.  
FileDescriptor getFD()	                It is used to return the FileDescriptor object.  
protected void finalize()	            It is used to ensure that the close method is call when there is no more reference to the file input stream.  
void close()	                        It is used to close the stream.  

## BufferedInputStream > FileInputStream
Java BufferedInputStream class is used to read information from stream.  
It internally uses buffer mechanism to make the performance fast.

## SequenceInputStream
SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).

## ByteArrayInputStream
The ByteArrayInputStream is composed of two words: ByteArray and InputStream. 
As the name suggests, it can be used to read byte array as input stream.