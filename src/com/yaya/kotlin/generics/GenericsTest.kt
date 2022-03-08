package generics

open class GenericsTest<T: NormalClass> {

    open fun forTest(t: T) {
        t.normalClassMethod()
    }
}