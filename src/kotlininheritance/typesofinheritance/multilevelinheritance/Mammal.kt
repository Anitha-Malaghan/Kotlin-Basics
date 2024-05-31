package kotlininheritance.typesofinheritance.multilevelinheritance

open class Mammal(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name mammal sound")
    }
}