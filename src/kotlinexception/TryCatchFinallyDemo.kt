package kotlinexception

fun main() {
    val result = try {
        divide(10, 0)
    } catch (e: IllegalArgumentException) {
        println(e.message)
        -1
    } finally {
        println("Cleanup code")
    }
    println("Result: $result")
}
