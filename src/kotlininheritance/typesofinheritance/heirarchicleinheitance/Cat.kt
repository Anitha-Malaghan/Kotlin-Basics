package kotlininheritance.typesofinheritance.heirarchicleinheitance

import kotlininheritance.typesofinheritance.singlelevelinheritance.Animal

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name meows")
    }
}