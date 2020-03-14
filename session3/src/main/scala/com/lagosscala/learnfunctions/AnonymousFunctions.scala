package com.lagosscala.learnfunctions

object AnonymousFunctions {


  //Function literal.
  lazy val callFiltered  = ???

  lazy val callFilteredPlaceholder = ???

  //The below function is one that takes Int and return Boolean.
  private val filterEquals10: Int => Boolean = ???
  lazy val callliterralFiltered: List[Int] = ???

  //A more interesting anonymous function
  private val add = ???
  val addResult = ???

  //You can chain multiple anonymous function to form higher order functions.
  lazy val chainedPartialFunction: Int = ???

  //List(1, 2, 4, 5, 6).reduceRight(_ + _)

}


object AnonymousFunctionsApp extends App {
  println(AnonymousFunctions.callFiltered)
  println(AnonymousFunctions.callFilteredPlaceholder)
  println(AnonymousFunctions.callliterralFiltered)

  println(AnonymousFunctions.addResult)
  println(AnonymousFunctions.chainedPartialFunction)

}
