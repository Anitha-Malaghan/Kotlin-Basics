package kotlindataclasses
data class User(val name: String, val age: Int)

fun main() {
    // Creating an instance of User data class
    val user1 = User("Alice", 25)
    println(user1) // toString() is called

    // Using copy() to create a new instance with some changes
    val user2 = user1.copy(name = "Bob")
    println(user2)

    // Checking equality using equals()
    val user3 = User("Alice", 25)
    println(user1 == user3) // true, as the properties are the same

    // Using hashCode()
    println(user1.hashCode())
    println(user3.hashCode())

    // Using componentN() functions for destructuring declarations
    val (name, age) = user1
    println("Name: $name, Age: $age")
}


