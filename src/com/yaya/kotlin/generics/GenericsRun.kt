package generics

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