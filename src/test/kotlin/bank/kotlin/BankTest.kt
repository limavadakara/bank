package bank.kotlin

import bank.Account
import org.junit.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class AccountTest {

        @Test
        fun `Account starts with balance 0`() {
            val account = Account()
            assertEquals("date || credit || debit || balance",
                    account.printStatement()
            )
        }

    @Test
    fun `Money can be depositted in an account`(){
        val account = Account()
        account.deposit(100.00)
        assertEquals(100.00, account.getBalance())
    }

    @Test
    fun `The right balance is calculated when money is depositted`(){
        val account = Account()
        account.deposit(100.00)
        account.deposit(20.00)
        assertEquals(120.00, account.getBalance())
    }

    @Test
    fun `Statement shows the transactions done with date, credit or debit and resulting balance`(){
        val account = Account()
        val date = LocalDate.now()
        account.deposit(100.00)
        assertEquals("date || credit || debit || balance ${date} || 100.00 || || 100.00", account.printStatement())
    }


}