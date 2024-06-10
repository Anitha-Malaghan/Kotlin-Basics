package kotlinexception

fun main() {
    val result = try {
        divide(10, 0)
    } catch (e: IllegalArgumentException) {
        -1
    }
    println("Result: $result")
}
