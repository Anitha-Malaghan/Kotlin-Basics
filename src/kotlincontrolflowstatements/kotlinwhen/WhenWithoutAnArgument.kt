package kotlincontrolflowstatements.kotlinwhen

fun main() {
    val a = 10
    val b = 20
    when {
        a > b -> println("a is greater than b")
        a < b -> println("a is less than b")
        else -> println("a is equal to b")
    }
}