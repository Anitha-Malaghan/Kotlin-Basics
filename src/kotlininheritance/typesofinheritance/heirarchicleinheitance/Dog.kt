package kotlininheritance.typesofinheritance.heirarchicleinheitance

import kotlininheritance.typesofinheritance.singlelevelinheritance.Animal

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks")
    }
}