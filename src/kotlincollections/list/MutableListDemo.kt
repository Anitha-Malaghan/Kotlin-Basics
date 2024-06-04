package kotlincollections.list

fun main() {
    // Create a mutable list of strings
    val mutableList = mutableListOf<String>()

    // Add elements to the list
    mutableList.add("apple")
    mutableList.add("banana")
    mutableList.add("orange")

    // Print the elements of the list
    println("Original List:")
    mutableList.forEach { println(it) }

    // Modify an element in the list
    mutableList[1] = "grape"

    // Add an element at a specific index
    mutableList.add(2, "kiwi")

    // Remove an element from the list
    mutableList.remove("apple")

    // Print the modified list
    println("\nModified List:")
    mutableList.forEach { println(it) }
}