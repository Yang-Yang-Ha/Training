package generics

open class NormalClass {
    open fun normalClassMethod() {
        println("normalClassMethod")
    }
}

open class NormalClassChild: NormalClass() {
    override fun normalClassMethod() {
        println("normalClassChildMethod")
    }
}