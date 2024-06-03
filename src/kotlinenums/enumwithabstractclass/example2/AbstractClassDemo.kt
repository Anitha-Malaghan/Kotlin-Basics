package kotlinenums.enumwithabstractclass.example2


fun main() {
    val deposit = TransactionType.DEPOSIT.createTransaction(100.0)
    val withdrawal = TransactionType.WITHDRAWAL.createTransaction(50.0)

    println(deposit.process())
    println(withdrawal.process())
}
//fun main() {
//    val deposit = TransactionType.DEPOSIT.apply { Transaction(100.0) }
//    val withdrawal = TransactionType.WITHDRAWAL.apply { Transaction(50.0) }
//
//    println(deposit.process())
//    println(withdrawal.process())
//}
