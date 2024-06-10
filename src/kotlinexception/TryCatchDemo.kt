package kotlinexception

fun main() {
    try {
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Caught exception: ${e.message}")
    }
}
