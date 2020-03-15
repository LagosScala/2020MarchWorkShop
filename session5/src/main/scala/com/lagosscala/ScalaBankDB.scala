package com.lagosscala


class ScalaBankDBa(account: String, amount: Double){

    private var bankTransaction: List[Transaction] = List.empty()

    def createAccount(account: BankAccount) = {

    }


    def deposit(deposit: Deposit): Boolean = ???

    def withdraw(withdraw: Withdraw): Either[String,Double] = ???


}