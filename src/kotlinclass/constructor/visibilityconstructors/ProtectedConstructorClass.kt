package kotlinclass.constructor.visibilityconstructors

// Protected constructors are not directly allowed for top-level classes in Kotlin
// They can be used in subclasses
open class ProtectedConstructorClass protected constructor(val name: String) {
    // Protected constructor, can be called in subclasses
}

class Subclass(name: String) : ProtectedConstructorClass(name)

// Top-level function to demonstrate the visibility of constructors
