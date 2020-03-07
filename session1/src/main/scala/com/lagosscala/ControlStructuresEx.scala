package com.lagosscala

object ControlStructuresEx extends App {

  //A simple for loop from 1 to 5 inclusive
  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for(numberOfDonuts <- 1 to 5){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("Step 2: A simple for loop from 1 to 5 inclusive")
  for(numberOfDonuts <- 1 to 10 by 2){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 3: A simple for loop from 1 to 5, where 5 is NOT inclusive")
  for(numberOfDonuts <- 1 until 5){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 4: Filter values using if conditions in for loop")
  val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
  for(ingredient <- donutIngredients if ingredient == "sugar"){
    println(s"Found sweetening ingredient = $ingredient")
  }

  println("\nStep 5: Filter values using if conditions in for loop and return the result back using the yield keyword")
  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
  } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")


  val arrayInts = 1 to 40
  val output = for{
    anInt <- arrayInts
    if(anInt % 2 ==0)
    if(anInt < 20)
  } yield anInt

  println(s" Even Numbers Less than 20 :: $output")
}
