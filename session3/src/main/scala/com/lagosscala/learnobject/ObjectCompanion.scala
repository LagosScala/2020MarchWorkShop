package com.lagosscala.learnobject

class ObjectCompanion (sing: List[String]) {
  def singSong =  ???
}


object ObjectCompanion {
  def apply(song1:String, song2: String): ObjectCompanion =  ???

  def apply(song1:String, song2:String, song3:String): ObjectCompanion = ???
}


object TestCompanion extends App {
  val singTwo = ObjectCompanion("Lovey - dovey", "Just rocking")
  println(singTwo.singSong)

  val singThree = ObjectCompanion("Joe winning", "Honor in the moon", "Winning")
  println(singThree.singSong)
}