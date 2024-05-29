package kotlinclass.constructor.visibilityconstructors

// Private constructor
class PrivateConstructorClass private constructor(val name: String) {
    // Private constructor, cannot be instantiated outside this class
    companion object {
        fun create(name: String): PrivateConstructorClass {
            return PrivateConstructorClass(name)
        }
    }
}