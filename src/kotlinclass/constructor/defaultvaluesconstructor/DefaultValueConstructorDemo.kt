package kotlinclass.constructor.defaultvaluesconstructor

fun main() {
    val user1 = User("Dave", 25)
    println("Name: ${user1.name}, Age: ${user1.age}")

    val user2 = User("Eve")
    println("Name: ${user2.name}, Age: ${user2.age}")
}