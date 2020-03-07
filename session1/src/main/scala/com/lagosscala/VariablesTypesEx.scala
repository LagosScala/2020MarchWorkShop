package com.lagosscala

object VariablesTypesEx  extends App {

  //In Scala you cannot simply create a variable and leave it un-initialized.
  //Mutable and Immutable Variables
  val anInt = 34;

  val aDouble = 23.0

  val strValue = "Hello"

  println(anInt + 34)

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
