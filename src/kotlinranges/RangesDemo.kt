package kotlinranges

fun main() {
    // Numeric ranges
    val range = 1..10
    println("Range: $range")

    // Checking if a number is in range
    val x = 5
    if (x in range) {
        println("$x is in range")
    }

    // Iterating over a range
    println("Iterating over range:")
    for (i in range) {
        println(i)
    }

    // Downward range
    val downRange = 10 downTo 1
    println("Downward range: $downRange")

    // Iterating over a downward range
    println("Iterating over downward range:")
    for (i in downRange) {
        println(i)
    }

    // Range with step
    val stepRange = 1..10 step 2
    println("Range with step: $stepRange")

    // Iterating over a range with step
    println("Iterating over range with step:")
    for (i in stepRange) {
        println(i)
    }

    // Character ranges
    val charRange = 'A'..'Z'
    println("Character range: $charRange")

    // Iterating over a character range
    println("Iterating over character range:")
    for (ch in charRange) {
        println(ch)
    }

    // Downward character range
    val downCharRange = 'z' downTo 'a'
    println("Downward character range: $downCharRange")

    // Iterating over a downward character range
    println("Iterating over downward character range:")
    for (ch in downCharRange) {
        println(ch)
    }
}