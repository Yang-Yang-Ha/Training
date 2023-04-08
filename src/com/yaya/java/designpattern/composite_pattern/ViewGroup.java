package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends View {

    List<View> children = new ArrayList<>();

    public ViewGroup(String name) {
        super(name);
    }

    public void addView(View view) {
        children.add(view);
    }

    @Override
    void measure() {
        System.out.println(name + ": Group's measure.");
        for (View child : children) {
            child.measure();
        }
    }
}
