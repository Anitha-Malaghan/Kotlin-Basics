package kotlinconstructors.visibilityconstructors.publicconstructor

import kotlinconstructors.visibilityconstructors.internalconstructor.InternalConstructorClass
import kotlinconstructors.visibilityconstructors.privateconstructor.PrivateConstructorClass
import kotlinconstructors.visibilityconstructors.protectedconstructor.Subclass

fun main(){
    // Public constructor
    val publicInstance = PublicConstructorClass("Alice")
    println("Public instance: ${publicInstance.name}")
}