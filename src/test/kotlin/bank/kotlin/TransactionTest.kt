package bank.kotlin

import org.junit.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.test.assertEquals

class TransactionTest {

    @Test
    fun `Transaction can be created`() {
        val transaction = Transaction(10.00, true, 100.00)
        assertEquals(10.00, transaction.amount)
    }

    @Test
    fun `Transaction can be a credit`() {
        val transaction = Transaction(10.00, true, 100.00)
        assertEquals(true, transaction.isCredit)
    }

    @Test
    fun `Transaction can be a debit`() {
        val transaction = Transaction(10.00, false, 100.00)
        assertEquals(false, transaction.isCredit)
    }

    @Test
    fun `Transaction can hold the date of transaction`() {
        val transaction = Transaction(10.00, true, 100.00)
        assertEquals(LocalDate.now(), transaction.date)
    }

    @Test
    fun `Transaction holds the balance resulting from the transaction`() {
        val transaction = Transaction(10.00, true, 100.00)
        assertEquals(100.00, transaction.resultingBalance)
    }
}
