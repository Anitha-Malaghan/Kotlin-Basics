package kotlinconstructors.visibilityconstructors.privateconstructor

// Class with a private constructor
class PrivateConstructorClass private constructor(val name: String) {
    // Companion object providing a factory method to create an instance
    companion object {
        fun create(name: String): PrivateConstructorClass {
            return PrivateConstructorClass(name)
        }
    }
}