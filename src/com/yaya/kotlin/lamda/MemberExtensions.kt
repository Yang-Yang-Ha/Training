package lamda

class Words{
    private val list = mutableListOf<String>()

    fun String.record(): Words{
        list.add(this)
        return this@Words
    }

    operator fun plus (string: String) {
        list.add(string)
    }


    override fun toString(): String = list.toString()
}

fun main() {
    val words = Words()
    with(words) {
        "one".record() + "two"
    }

    println(words.toString() == "[one, two]")
}