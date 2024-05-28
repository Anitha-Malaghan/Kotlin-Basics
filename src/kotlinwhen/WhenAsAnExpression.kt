package kotlinwhen

fun main() {
    val x = 5
    val result = when (x) {
        1 -> "One"
        2 -> "Two"
        3, 4, 5 -> "Three, Four, or Five"
        else -> "Unknown"
    }
    println(result) // Output: Three, Four, or Five
}