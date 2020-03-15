package com.lagosscala.learnfunctions


/**
*
  * When functions are members of an object they are called Methods \
  * Example methods
  */
object FunctionsAsMethods {

    def area(width: Int, breath: Int) : Int = ???

    /**Methods can house control statement and many other scala features**/
    def speak(name: String) : String = ???

}

object FunctionAsMethodsApp extends App {
  println(FunctionsAsMethods.area(2, 3))
  println(FunctionsAsMethods.speak("John"))
  println(FunctionsAsMethods.speak("Abraham"))
}