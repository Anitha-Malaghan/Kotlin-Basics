package kotlinabstractclass

// Another subclass inheriting from the abstract class and providing implementations
class Cat(name: String) : Animal(name) {
    override val sound: String
        get() = "Meow"

    override fun makeSound() {
        println("$name says: $sound")
    }
}