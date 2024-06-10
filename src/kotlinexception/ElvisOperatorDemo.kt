package kotlinexception
fun main() {
    val result:Int? = try {
        divide(10, 0)
    } catch (e: IllegalArgumentException) {
        null
    } ?: -2
    println("Result: $result")
}

/*fun division(a: Int, b: Int): Int? {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        return null // Provide a default value in case of division by zero
    }
}

fun main() {
    val result = division(10, 0) ?: -2
    println("Result: $result")
}*/

