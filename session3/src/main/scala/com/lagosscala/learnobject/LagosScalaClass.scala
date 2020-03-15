package com.lagosscala.learnobject


class LagosScalaClass {
  var message = ??? //This is an instance variable, the value can be different for different instance of the class.
  def preachScala(): String = ???
}


class RobustLagosScalaClass {
  private var message = ??? //This is an instance variable, the value can be different for different instance of the class.
  def preachScala(): String = ???
  def upateMessage(newMessage: String): Unit = ???
}

class MoreRobustLagosScalaClass(newMessage: String) {
  private val message = ??? //This is an instance variable, the value can be different for different instance of the class.
  def preachScala(): String = ???
}



object LagosScalaClassApp extends  App {

    val sampleLagosScala = new LagosScalaClass()
    println(sampleLagosScala.preachScala())

    val robustScala = new RobustLagosScalaClass()
    println(robustScala.preachScala())
    robustScala.upateMessage("In Lagos")
    println(robustScala.preachScala())

    val anotherRobustScala = new RobustLagosScalaClass()
    anotherRobustScala.upateMessage("Google arena")
    println(anotherRobustScala.preachScala())


    val evenMoreRobust = new MoreRobustLagosScalaClass("Somewhere")
    println(evenMoreRobust.preachScala())
}





