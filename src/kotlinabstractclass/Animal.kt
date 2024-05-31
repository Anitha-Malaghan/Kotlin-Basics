package kotlinabstractclass

// Abstract class definition
abstract class Animal(val name: String) {
    // Abstract property (must be overridden by subclasses)
    abstract val sound: String

    // Abstract method (must be implemented by subclasses)
    abstract fun makeSound()

    // Concrete method with implementation
    fun eat() {
        println("$name is eating")
    }
}