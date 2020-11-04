package com.yaya.annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * java.lang.reflect.AnnotatedElement
 * Class,Constructor,Field,Method,Package
 * Main Method：
 * 1.<T extend Annotation> getAnnotation(Class<T extends Annotation> class):is used to get the annotation of the specified annotation type,
 * if such an annotation is present in this class. The method returns that class in the form of an object.
 * 2.Annotation[] getAnnotations():returns annotations that are present on this element. If there are no annotations present on this element,
 * then it returns an array of length 0. The caller of this method can modify the returned array
 * 3.boolean isAnnotationPresent(Class<? extends Annotation> class): is used to check if an annotation of the specified annotation type is present in this class.
 * The method returns a boolean value stating the same.
 * 4.Annotation[] getDeclaredAnnotations():returns annotations declared only on the method and ignores inherited annotations by method.
 * If there are no annotations directly declared on the method, the returned array of annotation is empty.
 * Modification of the returned array will have no effect on the arrays returned to other callers.
 * All returned array of annotations are independent to each other when they called by the different caller.
 * 5.<T extends Annotation> getDeclaredAnnotation(Class<T extends Annotation> class):This method returns this class annotation for the specified type
 * if such an annotation is directly present, else null.
 * This method ignores inherited annotations.
 * 6.Annotation[] getAnnotationByType(Class<T extends Annotation> class):Returns annotations that are associated with this element
 * 7.Annotation[] getDeclaredAnnotationsByType(Class<T> class):Returns this element's annotation(s) for the specified type if such annotations are either directly present or indirectly present.
 */

public class AnnotationAnalysis {

    public static List<User> analysis(Class<?> clazz) {
        List<User> results = new ArrayList<>();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Property.class)) {
                Property property = field.getAnnotation(Property.class);
                User user = new User();
                user.setName(property.Name());
                user.setGender(property.Gender());
                results.add(user);
            }
        }
        return results;
    }
}
