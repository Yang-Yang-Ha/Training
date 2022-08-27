package collection

data class Hero(val name: String, val age: Int, val gender: Gender?)

enum class Gender {
    MALE, FEMALE
}

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE)
    )
    quizOne(heroes)
    quizTwo(heroes)
    foldAndReduce()
}

private fun foldAndReduce() {
    val numbers = listOf(5, 2, 10, 4)
    val sum = numbers.reduce { sum, element -> sum + element * 2 }
    println("reduce sum = $sum")
    val sumDoubled = numbers.fold(0) { sumDoubled, element -> sumDoubled + element * 2 }
    println("fold sum = $sumDoubled")
}

private fun quizOne(heroes: List<Hero>) {

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

fun quizTwo(heroes: List<Hero>) {
    //groupBy
    val mapByAge: Map<Int, List<Hero>> = heroes.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) -> group.size }
    println("Most people are in age$age")

    //associateBy
    val mapByName: Map<String, Hero> = heroes.associateBy { it.name }
    val frenchyAgeByGetValue = mapByName.getValue("Frenchy").age
    val frenchyAgeByProperty = mapByName["Frenchy"]?.age
    println("Frenchy's age is $frenchyAgeByProperty")

    //getOrElse
    val unknownHero = Hero("unknown", 0, null)
    mapByName.getOrElse("unknown") { unknownHero }.name

    //flatMap
    val (first, second) = heroes
        .flatMap {
            heroes.map { hero -> it to hero }
        }
        .maxBy { it.first.age - it.second.age }
}
