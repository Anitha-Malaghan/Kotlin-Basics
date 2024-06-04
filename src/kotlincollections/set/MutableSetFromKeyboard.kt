package kotlincollections.set

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter array size:")
    val length: Int =scanner.nextInt()

    // Create a mutable list of strings
    val mutableSet = mutableSetOf<String>()
    println("Enter fruits:")
    for(index in 0..length-1){

        mutableSet.add(scanner.next())
    }

    // Print the elements of the list
    println("Original List:")
    mutableSet.forEach { println(it) }

   /* Error

   // Modify an element in the list
    mutableSet[1] = "grape"

    // Add an element at a specific index
    mutableSet.add(2, "kiwi")
*/
    // Remove an element from the list
    mutableSet.remove("apple")

    // Print the modified list
    println("\nModified List:")
    mutableSet.forEach { println(it) }
}