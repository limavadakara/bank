package bank.kotlin

import bank.Account
import org.junit.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class AccountTest {

    @Test
    fun `Account starts with balance 0`() {
        val account = Account { amount: Double, isCredit: Boolean, resultingBalance: Double -> Transaction(amount, isCredit, resultingBalance) }
        assertEquals("date || credit || debit || balance",
                account.printStatement()
        )
    }

    @Test
    fun `Money can be depositted in an account`() {
        val account = Account { amount: Double, isCredit: Boolean, resultingBalance: Double -> Transaction(amount, isCredit, resultingBalance) }
        account.deposit(100.00)
        assertEquals(100.00, account.getBalance())
    }

    @Test
    fun `The right balance is calculated when money is depositted`() {
        val account = Account { amount: Double, isCredit: Boolean, resultingBalance: Double -> Transaction(amount, isCredit, resultingBalance) }
        account.deposit(100.00)
        account.deposit(20.00)
        assertEquals(120.00, account.getBalance())
    }

    fun mockFunction(amount: Double, isCredit: Boolean, resultingBalance: Double): MockTransaction {

        val mockTransaction = MockTransaction(amount, isCredit, resultingBalance)
        return mockTransaction


    }

    @Test
    fun `Statement shows the transactions done with date, credit or debit and resulting balance`() {

        val account = Account { amount: Double, isCredit: Boolean, resultingBalance: Double -> Transaction(amount, isCredit, resultingBalance) }
//        fun(Double, Boolean, Double): MockTransaction {return MockTransaction()})
        //= { amount: Double, isCredit: Boolean, resultingBalance: Double -> MockTransaction(amount, isCredit, resultingBalance )})
        val date = LocalDate.now()

        account.deposit(100.0)
        assertEquals("date || credit || debit || balance ${date} || 100.0 || || 100.0", account.printStatement())
    }



}

    class MockTransaction(val amount: Double, val isCredit: Boolean, val resultingBalance: Double) {
        val date = LocalDate.now()

    }