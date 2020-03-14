package com.lagosscala.learnobject


class LagosScalaClass {
  var message = "Everywhere" //This is an instance variable, the value can be different for different instance of the class.
  def preachScala(): String = s"Let us preach scala.. $message"
}


class RobustLagosScalaClass {
  private var message = "Everywhere" //This is an instance variable, the value can be different for different instance of the class.
  def preachScala(): String = s"Let us preach scala.. $message"
  def upateMessage(newMessage: String): Unit = {
    message = newMessage
  }
}

class MoreRobustLagosScalaClass(newMessage: String) {
  private val message = newMessage //This is an instance variable, the value can be different for different instance of the class.
  def preachScala(): String = {
    s"Let us preach scala.. $message"
  }
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





