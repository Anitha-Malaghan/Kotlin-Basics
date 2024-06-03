package kotlinenums.enumwithpropertiesandmethods

enum class CreditCardType(val discountRate: Double) {
    SILVER(0.02),   // 2% discount
    GOLD(0.05),     // 5% discount
    PLATINUM(0.1);  // 10% discount

    // Method to calculate discount for a given amount
    fun calculateDiscount(amount: Double): Double {
        return amount * discountRate
    }
}
