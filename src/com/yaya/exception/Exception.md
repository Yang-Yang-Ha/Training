## Checked Exception
Checked exceptions are checked at compile-time.
The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions

## Unchecked Exception
Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
The classes which inherit RuntimeException are known as unchecked exceptions

## Error
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

## Java Exception Keywords
1. try	    The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.
2. catch	The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
3. finally	The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.
4. throw	The "throw" keyword is used to throw an exception.
5. throws	The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.