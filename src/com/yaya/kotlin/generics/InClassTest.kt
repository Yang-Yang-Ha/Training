package generics

class InClassTest<in T: NormalClass> {

    fun inClassTestMethod(t: T) {
        t.normalClassMethod()
    }
}