package kotlincollections.set

fun main() {
    // Create a mutable set of strings
    val mutableSet = mutableSetOf<String>()

    // Add elements to the set
    mutableSet.add("apple")
    mutableSet.add("banana")
    mutableSet.add("orange")

    // Print the elements of the set
    println("Original Set:")
    mutableSet.forEach { println(it) }

    // Add a duplicate element (will not be added)
    mutableSet.add("banana")

    // Remove an element from the set
    mutableSet.remove("apple")

    // Print the modified set
    println("\nModified Set:")
    mutableSet.forEach { println(it) }

    /*
    // Modify an element in the list
    //Error: No set method providing array access
    mutableSet[1] = "grape"
    */

    // Update an element in the set
    mutableSet.remove("banana")
    mutableSet.add("grape")
}
