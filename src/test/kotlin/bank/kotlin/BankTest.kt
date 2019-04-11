package bank.kotlin

import bank.Account
import org.junit.Test
import kotlin.test.assertEquals

class AccountTest {

        @Test
        fun `Account starts with balance 0`() {
            val account = Account()
            assertEquals("date || credit || debit || balance",
                    account.printStatement()
            )
        }

}