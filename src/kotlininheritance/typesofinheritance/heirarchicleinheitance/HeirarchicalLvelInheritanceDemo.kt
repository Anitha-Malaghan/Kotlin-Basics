package kotlininheritance.typesofinheritance.heirarchicleinheitance

import kotlininheritance.typesofinheritance.singlelevelinheritance.Dog

// Hierarchical Inheritance: Dog and Cat classes inherit from Animal class
fun main() {
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")
    dog.makeSound() // Output: Buddy barks
    cat.makeSound() // Output: Whiskers meows
}
