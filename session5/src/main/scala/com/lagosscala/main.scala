package com.lagosscala


object Main extends App {

  private var bankAccounts = Map[BankAccount,List[Transaction]]()

  while(true){
      val input = scala.io.StdIn.readLine()
      CommandLineParser(input) match {
        case Some(x) =>  x match {
          case balance: Balance  => 
            bankAccounts.get(BankAccount(balance.account)) match {
              case Some(txnList) => 
              val deposits = txnList.filter(_.activity == "deposit").map(_.amount).sum
              val withdraw = txnList.filter(_.activity == "withdraw").map(_.amount).sum 

              val balance = deposits - withdraw 

              println(s"your closing account balance is $balance")

              case None          => println("account not found")
            }
          case activity: Transaction  => 
            bankAccounts.get(BankAccount(activity.account)) match{
              case Some(txnList) => 
              val newList = activity :: txnList

              bankAccounts = bankAccounts + (BankAccount(activity.account) -> newList )
                 println(s"successful ${activity.activity} amount ${activity.amount}")
              case None          => println("account not found ")
            }
        
          case bankAccount: BankAccount =>  bankAccounts ++= Map(bankAccount -> List[Transaction]())
            println(s"successfully created an account $bankAccount")
        }
 
      case None => println("Invalid Input")

  }
}

}