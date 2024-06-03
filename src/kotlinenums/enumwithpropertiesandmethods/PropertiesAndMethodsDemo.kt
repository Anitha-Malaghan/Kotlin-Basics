package kotlinenums.enumwithpropertiesandmethods


// Enum with a property and a method
fun main() {
    val cardType: CreditCardType = CreditCardType.PLATINUM
    val purchaseAmount = 1000.0

    println("Card Type: ${cardType.name}")
    println("Discount Rate: ${cardType.discountRate}")
    println("Discount for $$purchaseAmount: $${cardType.calculateDiscount(purchaseAmount)}")

    val allCardTypes: Array<CreditCardType> = CreditCardType.values()
    allCardTypes.forEach {
        println("${it.name} card gives a discount of ${it.discountRate * 100}%")
    }
}
