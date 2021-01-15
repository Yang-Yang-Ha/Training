package annotation;

import java.util.List;

public class AnnotationMain {

    @Property(Name = "Jes", Gender = "female")
    private User one;

    @Property(Name = "Jos")
    private User two;

    @Property
    private User three;

    public static void main(String[] args) {

        List<User> users = AnnotationAnalysis.analysis(AnnotationMain.class);
        for (User user : users) {
            System.out.println(user.getName() + ":" + user.getGender());
        }
    }
}
