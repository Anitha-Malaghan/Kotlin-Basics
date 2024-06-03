package kotlinenums.enumwithabstractclass.example2

abstract class Transaction(val amount: Double) {
    abstract fun process(): String
}