package composite_pattern;

public class Canvas {

    public static void main(String[] args) {
        ViewGroup viewGroup = new ViewGroup("Group One");
        viewGroup.addView(new View("First"));
        viewGroup.addView(new View("Second"));
        viewGroup.addView(new View("Third"));

        viewGroup.measure();
    }
}
