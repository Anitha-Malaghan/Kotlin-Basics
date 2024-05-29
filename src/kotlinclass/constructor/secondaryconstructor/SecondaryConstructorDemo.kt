package kotlinclass.constructor.secondaryconstructor
fun main() {
    val person1 = Person("Bob", 25)
    println("Name: ${person1.name}, Age: ${person1.age}")

    val person2 = Person("Charlie")
    println("Name: ${person2.name}, Age: ${person2.age}")
}
