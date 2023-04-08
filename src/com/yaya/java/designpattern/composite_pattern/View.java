package composite_pattern;

public class View {

    protected String name;

    public View(String name) {
        this.name = name;
    }

    void measure() {
        System.out.println(name + ": View's Measure");
    }
}
