class chapter04 {
}
fun main(){
//    test1()
//    test2()
//    test3()
//    test4()
//    test5()
//    test6()
//    test7()
//    test8()
//    test9()
//    test10()
    test11()
}

fun test11() {
    // good!!
    fun systemInfo2(): String {
        return when (val numberOfCores = Runtime.getRuntime().availableProcessors()) {
            1 -> "1 core, packing....."
            in 2..16 -> "You have $numberOfCores cores"
            else -> "$numberOfCores cores!, I wan..."
        }
    }
    println(systemInfo2())
}

fun test10() {
    // not bad.. not good..
    fun systemInfo1(): String {
        val numberOfCores = Runtime.getRuntime().availableProcessors()
        return when (numberOfCores) {  // 내부 변수 사용
            1 -> "1 core, packing....."
            in 2..16 -> "You have $numberOfCores cores"
            else -> "$numberOfCores cores!, I wan..."
        }
    }

    println(systemInfo1())
}

fun test9() {
    fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
        "Saturday", "Sunday" -> println("Relax")
        in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> println("Work hard")
        in 2..4 -> println("Work hard")
        "Friday" -> println("Party")
        is String -> println("What?")
        else -> println("No clue")
    }

    whatToDo("Sunday")  // Relax
    whatToDo("Wednesday")  // Work hard
    whatToDo(3)  // Work hard
    whatToDo("Friday")  // Party
    whatToDo("Munday")  // What?
    whatToDo(8) // No clue
}

fun test8() {
//    표현식으로 When이 사용될 경우 else는 필수입니다.
    fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
        "Saturday", "Sunday" -> "Relax"
        in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
        in 2..4 -> "Work hard"
        "Friday" -> "Party"
        is String -> "What?"
        else -> "No clue"
    }

    println(whatToDo("Sunday"))  // Relax
    println(whatToDo("Wednesday"))  // Work hard
    println(whatToDo(3))  // Work hard
    println(whatToDo("Friday"))  // Party
    println(whatToDo("Munday"))  // What
    println(whatToDo(8))  // No clue
}

fun test7() {
    // good!!
    fun isAliveGood(alive: Boolean, numberOfLiveNeighbors: Int) = when {
        numberOfLiveNeighbors < 2 -> false
        numberOfLiveNeighbors > 3 -> false
        numberOfLiveNeighbors == 3 -> true
        else -> alive && numberOfLiveNeighbors == 2
    }

    println(isAliveGood(false,3))
    println(isAliveGood(true,2))
}

fun test6() {
    // bad!!
    fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int): Boolean {
        if (numberOfLiveNeighbors < 2) {
            return false
        }
        if (numberOfLiveNeighbors > 3) {
            return false
        }
        if (numberOfLiveNeighbors == 3) {
            return true
        }
        return alive && numberOfLiveNeighbors == 2
    }
    println(isAlive(true,3))
    println(isAlive(true,2))
}

fun test5() {
    val names = listOf("NAM", "NUM", "NIM")

// 방법1
    for ( index in names.indices) {
        println("index is ${names.get(index)}")
    }

// 방법2
    for ((index, name) in names.withIndex()) {
        println("position of $name is $index")
    }
}

fun test4() {
    for (i in (1..9).filter { it % 3 == 0 || it % 5 == 0 }) {
        print("$i, ")
    }
}

fun test3() {
    for (i in 1 until 10 step 3) {
        print("$i, ")
    }
}

fun test2() {
    for (i in 1 until 5) {
        print("$i, ")
    }
}

fun test1() {
    for ( i in 1..5) {
        // logic..
        println("$i")
    }

// 후방향
    for ( i in 5.downTo(1)) {
        // logic...
        println("$i")
    }
}
