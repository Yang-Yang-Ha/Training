package com.yaya.test;

import com.yaya.generics.GenericsWildcard;

public class TextMain {

    public static void main(String[] args) {
        GenericsWildcard genericsWildcard = new GenericsWildcard();
        GenericsWildcard.Child child = new GenericsWildcard.Child();
        genericsWildcard.upperBoundedWildcardMethod(child);
        GenericsWildcard.Father father = new GenericsWildcard.Father();
        genericsWildcard.upperBoundedWildcardMethod(father);
    }
}
