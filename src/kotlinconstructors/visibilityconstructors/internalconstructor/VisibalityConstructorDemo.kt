package kotlinconstructors.visibilityconstructors.internalconstructor

import kotlinconstructors.visibilityconstructors.privateconstructor.PrivateConstructorClass
import kotlinconstructors.visibilityconstructors.publicconstructor.PublicConstructorClass
import kotlinconstructors.visibilityconstructors.protectedconstructor.Subclass

fun main() {

    // Internal constructor
    val internalInstance = InternalConstructorClass("Charlie")
    println("Internal instance: ${internalInstance.name}")

}
