package generics

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
    genericsRun.runInClassTest2(InClassTest())
}
class GenericsRun {

    fun runGenericsTest() {
        val genericsTest = GenericsTest<NormalClassChild>()
        genericsTest.forTest(NormalClassChild())
    }

    fun runInClassTest() {
        val inClassTest = InClassTest<NormalClass>()
        inClassTest.inClassTestMethod(NormalClassChild())
    }

    fun runInClassTest2(inClassTest: InClassTest<NormalClass>) {
        val inClassChild: InClassTest<NormalClassChild> = inClassTest
        inClassChild.inClassTestMethod(NormalClassChild())
    }

    fun runOutClassTest(outClassTest: OutClassTest<Any>) {
        outClassTest.outClassTestMethod()
    }

}