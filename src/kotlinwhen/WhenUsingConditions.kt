package kotlinwhen

fun main() {
    val x = 10
    when {
        x % 2 == 0 -> println("x is even")
        x % 2 != 0 -> println("x is odd")
    }
}