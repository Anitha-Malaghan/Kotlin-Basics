package kotlinconstructors.visibilityconstructors.privateconstructor

import kotlinconstructors.visibilityconstructors.privateconstructor.PrivateConstructorClass
import kotlinconstructors.visibilityconstructors.publicconstructor.PublicConstructorClass
import kotlinconstructors.visibilityconstructors.protectedconstructor.Subclass

fun main() {
    // Private constructor
    val privateInstance = PrivateConstructorClass.create("Bob")
    println("Private instance: ${privateInstance.name}")


}
