package kotlinabstractclass

fun main() {
    val dog = Dog("Rocky")
    dog.eat()          // Output: Buddy is eating
    dog.makeSound()    // Output: Buddy says: Bark

    val cat = Cat("Billi")
    cat.eat()          // Output: Whiskers is eating
    cat.makeSound()    // Output: Whiskers says: Meow
}