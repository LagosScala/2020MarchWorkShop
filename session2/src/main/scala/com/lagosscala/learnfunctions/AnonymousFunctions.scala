package com.lagosscala.learnfunctions

object AnonymousFunctions {


  //Function literal.
  lazy val callFiltered = List(1, 2, 4, 5, 6).filter(x => x * 5 == 10)

  lazy val callFilteredPlaceholder = List(1, 2, 4, 5, 6).filter(_ * 5 == 10)

  //The below function is one that takes Int and return Boolean.
  private val filterEquals10: Int => Boolean = (x: Int) => x * 5 == 10
  lazy val callliterralFiltered: List[Int] =
    List(1, 2, 4, 5, 6).filter(filterEquals10)

  //A more interesting anonymous function
  private val add = (_: Int) + (_: Int)
  val addResult = add(3, 4)

  //You can chain multiple anonymous function to form higher order functions.
  lazy val chainedPartialFunction: Int = Array(2, 3, 44, 5, 6, 7, 7, 2, 4,
    6).map(_ * 2).filterNot(filterEquals10).count(x => x < 15)
}


object AnonymousFunctionsApp extends App {
  println(AnonymousFunctions.callFiltered)
  println(AnonymousFunctions.callFilteredPlaceholder)
  println(AnonymousFunctions.callliterralFiltered)

  println(AnonymousFunctions.addResult)
  println(AnonymousFunctions.chainedPartialFunction)

}
