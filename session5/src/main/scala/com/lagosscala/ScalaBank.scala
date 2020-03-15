package com.lagosscala
 
sealed trait  Action
case class BankAccount(
  account: String
) extends Action

case class Balance(account:String)  extends Action


case class Transaction(
  account: String, 
  activity: String, //deposit or withdraw
  amount: Double 
) extends Action


case class ErrorMessage(message: String) extends Action


