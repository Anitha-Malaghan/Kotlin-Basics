package kotlinfunctions.infixfunction

class Person(val name: String, val age: Int) {
    infix fun isOlderThan(other: Person): Boolean {
        return this.age > other.age
    }
}

fun main() {
    val john = Person("John", 30)
    val mary = Person("Mary", 25)

    println("${john.name} is older than ${mary.name}: ${john isOlderThan mary}")
}
