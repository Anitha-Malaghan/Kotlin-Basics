package kotlinpredicates

fun main() {
    // Sample list of numbers
    val numbers = listOf(1, 2, 3, 4, 5)

    // Predicate functions
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    val isOdd: (Int) -> Boolean = { it % 2 != 0 }

    // All predicate functions
    val allEven = numbers.all(isEven)
    val allOdd = numbers.all(isOdd)

    // Any predicate functions
    val containsEven = numbers.any(isEven)
    val containsOdd = numbers.any(isOdd)

    // Count predicate functions
    val countEven = numbers.count(isEven)
    val countOdd = numbers.count(isOdd)

    // Find predicate functions
    val firstEven = numbers.find(isEven)
    val firstOdd = numbers.find(isOdd)

    // Output results
    println("Numbers: $numbers")
    println("All Even: $allEven")
    println("All Odd: $allOdd")
    println("Contains Even: $containsEven")
    println("Contains Odd: $containsOdd")
    println("Count Even: $countEven")
    println("Count Odd: $countOdd")
    println("First Even: $firstEven")
    println("First Odd: $firstOdd")
}
