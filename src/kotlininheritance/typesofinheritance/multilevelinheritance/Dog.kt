package kotlininheritance.typesofinheritance.multilevelinheritance


class Dog(name: String) : Mammal(name) {
    override fun makeSound() {
        println("$name barks")
    }
}