package kotlincontrolflowstatements.kotlinwhen

fun main () {

    val x = 2
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3, 4, 5 -> println("x is 3, 4, or 5") // Multiple values
        else -> println("x is neither 1 nor 2 nor 3, 4, or 5") // Default case
    }
}