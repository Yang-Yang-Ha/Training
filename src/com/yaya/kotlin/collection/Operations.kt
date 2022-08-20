package collection

data class Hero(val name: String, val age: Int, val gender: Gender?)

enum class Gender {
    MALE, FEMALE
}

fun main() {
    quizOne()
}

private fun quizOne() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE)
    )

    //distinct
    val distinctSize = heroes.map { it.age }.distinct().size

    //filter
    val ageLessThan30 = heroes.filter { it.age < 30 }.size

    //partition
    val (youngest, oldest) = heroes.partition { it.age < 30 }

    //maxBy
    val maximizedHeroName = heroes.maxBy { it.age }.name

    //all
    val areAllHeroesLessThan50 = heroes.all { it.age < 50 }

    //any
    val isAnyHeroAWoman = heroes.any { it.gender == Gender.FEMALE }

    println(
        "distinctHeroSize = $distinctSize, " +
                "ageLessThan30 = $ageLessThan30, " +
                "youngerGroupSize = ${youngest.size}, " +
                "olderGroupSize = ${oldest.size}, " +
                "maximizedHeroName = $maximizedHeroName, " +
                "areAllHeroesLessThan50 = $areAllHeroesLessThan50, " +
                "isAnyHeroAWoman = $isAnyHeroAWoman"
    )
}
