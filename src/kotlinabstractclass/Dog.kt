package kotlinabstractclass

// Subclass inheriting from the abstract class and providing implementations
class Dog(name: String) : Animal(name) {
    override val sound: String = "Bark"

    override fun makeSound() {
        println("$name says: $sound")
    }
}