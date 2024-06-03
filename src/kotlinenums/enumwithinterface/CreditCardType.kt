package kotlinenums.enumwithinterface

enum class CreditCardType(val color: String, val maxLimit: Int = 1000000): ICardCashBack {
    SILVER("gray", 50000) {
        override fun getCashbackValue(): Float = 0.02f
    },
    GOLD("gold"){
        override fun getCashbackValue(): Float = 0.04f
    },
    PLATINUM("black"){
        override fun getCashbackValue(): Float = 0.06f
    }
}