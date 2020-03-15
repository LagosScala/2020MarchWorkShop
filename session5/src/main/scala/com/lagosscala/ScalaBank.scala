package com.lagosscala


sealed trait Transaction 

case class Deposit(
  amount: Double  
) extends Transaction

case class Withdraw(
    amount: Double
) extends Transaction


