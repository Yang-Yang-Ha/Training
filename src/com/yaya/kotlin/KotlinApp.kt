import generics.GenericsRun
import generics.NormalClassChild
import generics.OutClassTest

fun main() {
    val genericsRun = GenericsRun()
    genericsRun.runOutClassTest(object : OutClassTest<NormalClassChild> {
        override fun outClassTestMethod(): NormalClassChild {
            val normalClassChild = NormalClassChild()
            normalClassChild.normalClassMethod()
            return normalClassChild
        }
    })
    genericsRun.runGenericsTest()
    genericsRun.runInClassTest()
}