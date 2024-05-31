package kotlininheritance.typesofinheritance.singlelevelinheritance


class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks")
    }
}