package com.lagosscala.learnfunctions

object CurriedFunction {

  def add(a: Int)(b: Int)(c: Int): Int = ???

  def callFamily(surname: String)(lastName: String)(position: String) :String = ???

}

object CurriedFunctionApp extends App {
  import CurriedFunction._

    val prepareA = ???
//    print(prepareA(4)(5))


  val callAdegoke = callFamily("Adegoke") _
  println(callAdegoke("John")("First Son"))
  println(callAdegoke("Gbemi")("First Daughter"))
  println(callAdegoke("Badejo")("Father"))
  println(callAdegoke("Wura")("Mother"))

  val callAdios = callFamily("Adio") _
  println(callAdios("Frank")("Only Son"))
  println(callAdios("Beatrice")("Only Daughter"))
  println(callAdios("Gbenga")("Father"))
  println(callAdios("Adunni")("Mother"))
}
