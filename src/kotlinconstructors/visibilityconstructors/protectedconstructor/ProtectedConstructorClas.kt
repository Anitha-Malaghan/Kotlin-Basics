package kotlinconstructors.visibilityconstructors.protectedconstructor

open class ProtectedConstructorClass protected constructor(val name: String) {
    // Protected constructor, can be called in subclasses
}