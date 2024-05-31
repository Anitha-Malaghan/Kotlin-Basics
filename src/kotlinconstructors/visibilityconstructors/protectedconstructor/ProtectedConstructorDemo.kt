package kotlinconstructors.visibilityconstructors.protectedconstructor

import kotlinconstructors.visibilityconstructors.internalconstructor.InternalConstructorClass
import kotlinconstructors.visibilityconstructors.privateconstructor.PrivateConstructorClass
import kotlinconstructors.visibilityconstructors.publicconstructor.PublicConstructorClass

fun main(){

    // Protected constructor
    val protectedInstance = Subclass("Dave")
    println("Protected instance: ${protectedInstance.name}")
}