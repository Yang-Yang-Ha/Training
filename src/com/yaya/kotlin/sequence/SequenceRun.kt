package sequence

fun main() {
    generateSequenceTest()
}

private fun generateSequenceTest() {
    val numbers = generateSequence(3) { n ->
        println("Generating element...")
        (n + 1).takeIf { it < 7 }
    }
    val numberTwo = sequence {
        var x = 0
        while (true) {
            println("numberTwo number: $x")
            yield(x++)
        }
    }
    println(numbers.count())
    println(numberTwo.take(5).toList())
}

private fun fibonacci(): Sequence<Int> = sequence {
    var terms = Pair(0, 1)

    while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first + terms.second)
    }
}