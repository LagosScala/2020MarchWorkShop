package com.lagosscala.learnfunctions


/**
*
  * When functions are members of an object they are called Methods \
  * Example methods
  */
object FunctionsAsMethods {

    def area(width: Int, breath: Int) : Int = {
     2 * (width * breath)
    }

    /**Methods can house control statement and many other scala features**/
    def speak(name: String) : String = {
      if (name != "John") {
        s"You just renamed me as $name"
      } else {
        s"My name is John"
      }
    }

}

object FunctionAsMethodsApp extends App {
  println(FunctionsAsMethods.area(2, 3))
  println(FunctionsAsMethods.speak("John"))
  println(FunctionsAsMethods.speak("Abraham"))
}