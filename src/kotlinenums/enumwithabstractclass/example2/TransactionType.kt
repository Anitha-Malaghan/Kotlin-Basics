package kotlinenums.enumwithabstractclass.example2

enum class TransactionType {
    DEPOSIT {
        override fun createTransaction(amount: Double): Transaction {
            return object : Transaction(amount) {
                override fun process(): String {
                    return "Depositing $$amount"
                }
            }
        }
    },
    WITHDRAWAL {
        override fun createTransaction(amount: Double): Transaction {
            return object : Transaction(amount) {
                override fun process(): String {
                    return "Withdrawing $$amount"
                }
            }
        }
    };

    abstract fun createTransaction(amount: Double): Transaction
}