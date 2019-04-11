package bank.kotlin

import java.time.LocalDate

class Transaction(val amount: Double, val isCredit: Boolean, val resultingBalance: Double) {
    val date = LocalDate.now()

}
