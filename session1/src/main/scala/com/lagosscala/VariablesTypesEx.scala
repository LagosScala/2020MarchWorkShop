package com.lagosscala

object VariablesTypesEx  extends App {

  //In Scala you cannot simply create a variable and leave it un-initialized.
  //Mutable and Immutable Variables
  val anInt: Int = 34;

  val aDouble: Double = 23.0

  val strValue: String = "Hello"

  val aLongVal: Long = 345L

  //in Java this is referred to as a statement
  println(anInt + 34)

  //in scala, it is an expression ..because it returns a value
  val output: Unit = println("hello")

  /*
  Expressions provide a foundation for functional programming because they make it possible to return data
  instead of modifying existing data (such as a variable). This enables the use of immutable data, a key functional
  programming concept where new data is stored in new values instead of in existing variables
  */

  val amount  = {
    val x = 5 * 20
    x + 10
  }

  //will not work
 // println(aDouble / "justastring")

  //Declaring a Tuple
  val ingredient = ("Sugar" , 25)

  //Accessing the Elements of the Tuple
  println(ingredient._1) // Sugar
  println(ingredient._2) // 25


  //Pattern Matching on Tuple
  val (name, quantity) = ingredient
  println(name) // Sugar
  println(quantity) // 25
}
