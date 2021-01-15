package basic;

public class JavaString {

    public void stringBufferMethod() {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" java");
        System.out.println(buffer);
    }

    public void stringBuilderMethod() {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" java");
        System.out.println(builder);
    }

    public void bufferAndBuildPerforming() {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            buffer.append(" hello");
        }
        System.out.println("time taken by StringBuffer:" + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(" hello");
        }
        System.out.println("time taken by StringBuilder:" + (System.currentTimeMillis() - startTime) + "ms");
    }

    /*
    The backslash (\) escape character turns special characters into string characters
    Six other escape sequences are valid in Java:
    \n	New Line
    \r	Carriage Return
    \t	Tab
    \b	Backspace
    \f	Form Feed
     */
    public void specialCharacters() {
        String text = "We are the so-called \"Vikings\" from the north.";
        System.out.println(text);
    }
}
