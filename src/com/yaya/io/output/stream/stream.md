# OutputStream Class
1. public void write(int)throws IOException	    is used to write a byte to the current output stream. 
2. public void write(byte[])throws IOException	is used to write an array of byte to the current output stream.
3. public void flush()throws IOException	    flushes the current output stream.
4. public void close()throws IOException	    is used to close the current output stream.

## FileOutputStream
Java FileOutputStream is an output stream used for writing data to a file.  
This is mostly used to write bytes to a file.

### Method
protected void finalize()	                It is used to clean up the connection with the file output stream.  
void write(byte[] ary)	                    It is used to write ary.length bytes from the byte array to the file output stream.  
void write(byte[] ary, int off, int len)	It is used to write len bytes from the byte array starting at offset off to the file output stream.  
void write(int b)	                        It is used to write the specified byte to the file output stream.  
FileChannel getChannel()	                It is used to return the file channel object associated with the file output stream.  
FileDescriptor getFD()	                    It is used to return the file descriptor associated with the stream.  
void close()	                            It is used to closes the file output stream.  

## BufferedOutputStream > FileOutputStream
Java BufferedOutputStream class is used for buffering an output stream. It internally uses buffer to store data. 
It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.

## ByteArrayOutputStream
ByteArrayOutputStream class is used to write common data into multiple files. In this stream, 
the data is written into a byte array which can be written to multiple streams later.
The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
The buffer of ByteArrayOutputStream automatically grows according to data.
