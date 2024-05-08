package basic

fun main() {
    val personA = Person("Stephen", 33)
    val personB = personA
    personB.age = 80
    println("PersonA's age is ${personA.age}")
}

data class Person(var name: String, var age: Int)