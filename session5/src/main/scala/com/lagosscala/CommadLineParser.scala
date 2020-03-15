package com.lagosscala


object CommandLineParser {
    
    def apply(input: String): Option[Action] = {
        try{
            val values = input.split(" ").toList 

            values match {
              case List("createAccount", account) => Some(BankAccount(account))
              case List("balance" , account) => Some(Balance(account))
              case List(account , "deposit", amount) => Some(Transaction(account, "deposit", amount.toDouble))
              case List(account,  "withdraw", amount) => Some(Transaction(account, "withdraw", amount.toDouble))
            }
        } catch {
            case e: Exception => Some(ErrorMessage("error processing input"))
        }
    }
}