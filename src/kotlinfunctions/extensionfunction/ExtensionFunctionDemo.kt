package kotlinfunctions.extensionfunction

fun String.reverse(): String {
    return this.reversed()
}

fun main() {
    val original = "Kotlin"
    val reversed = original.reverse()
    println("Reversed: $reversed")
}