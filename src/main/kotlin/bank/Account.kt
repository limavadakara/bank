package bank

import bank.kotlin.Transaction

class Account {
    private var balance : Double = 0.00
    private var transactions : MutableList<Transaction> = ArrayList()

    fun printStatement() : String {
        var transactionDetails = ""
        this.transactions.forEach {
            transactionDetails += " ${it.date} || ${it.amount} || || ${it.resultingBalance}"
        }
        return "date || credit || debit || balance" + transactionDetails
    }

    fun deposit(amount : Double){
        this.balance += amount
        this.transactions.add(Transaction(amount, true, this.balance))
    }

    fun getBalance() : Double{
        return balance
    }
}
