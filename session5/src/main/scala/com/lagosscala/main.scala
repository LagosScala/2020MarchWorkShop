package com.lagosscala


object Main extends App {

  while(true){
      val input = scala.io.StdIn.readLine()
      CommandLineParser(input) match {
        case Some(x) =>  x match {
          case deposit: Deposit  => 
          case withdraw: Withdraw => 
          case bankAccount: BankAccount => 
      }

      case None => println("Invalid Input")

  }
}

}