package kotlininheritance.typesofinheritance.multipleinheritance

// Implementing both interfaces in a single class
class Dog : IAnimal, IPet {
    override fun eat(){
        println("Dog is eating")
    }
    override fun play(){
        println("Dog is playing")
    }

}