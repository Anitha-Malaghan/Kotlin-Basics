package kotlinpolymorphism

open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}
class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Cat meows")
    }
}

fun main() {
    val myAnimal: Animal = Dog() // Polymorphism: Animal reference to a Dog object
    myAnimal.makeSound()         // Output: Dog barks

    val anotherAnimal: Animal = Cat() // Polymorphism: Animal reference to a Cat object
    anotherAnimal.makeSound()         // Output: Cat meows
}