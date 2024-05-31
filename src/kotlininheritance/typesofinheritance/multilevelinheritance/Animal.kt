package kotlininheritance.typesofinheritance.multilevelinheritance

open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes a sound")
    }
}