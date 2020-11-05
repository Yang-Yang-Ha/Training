package com.yaya.generics;

import java.util.ArrayList;

public class GenericsWildcard {

    public void wildcardMethod(GenericsClass<? extends String> genericsClass) {
        genericsClass.print();
    }

    public <F extends Father> void upperBoundedWildcardMethod(F father) {
        System.out.println("number type:" + father.getClass().getSimpleName());
    }

    public void unboundedWildcardMethod(ArrayList<?> objects) {
        objects.forEach(object -> {
            System.out.println("object type:" + object.getClass().getSimpleName());
        });
    }

    public void lowerBoundedWildcardMethod(ArrayList<? super Child> children) {
        children.forEach(child -> {
            System.out.println("object type:" + child.getClass().getSimpleName());
        });
    }
/*
    This is not allowed:
    public <C super Child> void lowerBoundedWildcardMethod(C child) {
        System.out.println("number type:" + child.getClass().getSimpleName());
    }*/

    public static class Father {
        public void drink() {
            System.out.println("I love drinking");
        }

        public void eat() {
            System.out.println("I love eating");
        }

        public void bet() {
            System.out.println("I love bet");
        }

        public void prostitute() {
            System.out.println("I love prostitution");
        }
    }

    public static class Child extends Father {
        public void self() {
            System.out.println("I don't like all of my father's hobbies");
        }
    }
}
