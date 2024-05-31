package kotlininheritance
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes a sound")
    }
}
// Subclass (Derived class)
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks")
    }
}

fun main() {
    val dog = Dog("Buddy")
    dog.makeSound() // Output: Buddy barks
}