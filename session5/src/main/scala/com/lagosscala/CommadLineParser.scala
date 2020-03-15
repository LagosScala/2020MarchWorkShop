package com.lagosscala


object CommandLineParser {
    
    def apply(input: String): Option[Transaction] = {
        try{
            val values = input.split(" ").toList 

            values match {
                case List("createAccount", name) => Some(BankAccount(name))
                case List("withdraw", account) => Some(Withdraw(amount.toDouble))
                case List("deposit", account)  => Some(Deposit(amount.toDouble))
            }
        }
    }
}