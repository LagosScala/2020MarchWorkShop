package com.lagosscala

case class User( id: Int, firstName: String,  lastName: String,  age: Int,  gender: Option[String])

object OptionsEx extends App {

  val mapEx = Map("Ayushi" -> 0, "Megha" -> 1, "Ruchi" -> 2)

  println( mapEx.get("name"))

  println( mapEx.get("Ayushi"))

  val usersMap = Map(1 -> User(1, "John", "Doe", 32, Some("male")), 2 -> User(2, "Johanna", "Doe", 30, None),
     3 -> User(3, "Alex", "Dagras", 35, None), 4 -> User(4, "Tamara", "Dagras", 35, None)
  )

  def findById(id: Int): Option[User] = usersMap.get(id)

  val aUser = findById(3)

  /*
  Don't do this
  if(aUser.isDefined){
    println(aUser.get.firstName)
  }
   */

  aUser match {
    case Some(value) => println(s"Found a User ${value}")
    case None => println(" Didn't find any user with the corresponding id")
  }
}
