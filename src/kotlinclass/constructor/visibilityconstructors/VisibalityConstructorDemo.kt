package kotlinclass.constructor.visibilityconstructors

fun main() {
    // Public constructor
    val publicInstance = PublicConstructorClass("Alice")
    println("Public instance: ${publicInstance.name}")

    // Private constructor
    val privateInstance = PrivateConstructorClass.create("Bob")
    println("Private instance: ${privateInstance.name}")

    // Internal constructor
    val internalInstance = InternalConstructorClass("Charlie")
    println("Internal instance: ${internalInstance.name}")

    // Protected constructor
    val protectedInstance = Subclass("Dave")
    println("Protected instance: ${protectedInstance.name}")
}
