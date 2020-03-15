package com.lagosscala.learnobjects

import org.scalatest.wordspec.AnyWordSpec

import com.lagosscala.learnobject._

class LagosScalaClassTestSpec extends AnyWordSpec {


  "Lagos Scala Class" should {
    "return string with Everywhere" in {
        val sampleLagosScala = new LagosScalaClass()
        assert(true, sampleLagosScala.preachScala().contains("Everywhere"))
    }
  }

  "Robust Lagos Scala Class" should {
    "return string with Everywhere" in {
      val robustScala = new RobustLagosScalaClass()
      assert(true, robustScala.preachScala().contains("Everywhere"))
    }

    "Contain updated message in preach scala" in {
      val anotherRobustScala = new RobustLagosScalaClass()
      val updatedMessage = "In the world"
      anotherRobustScala.upateMessage(updatedMessage)
      assert(true, anotherRobustScala.preachScala().contains(updatedMessage))
    }
  }

  "More Robust Scala" should {
    "return instantiated message in class parameter" in {
      val message = "In Lagos, google arena"
      val moreRobustScalaClass = new MoreRobustLagosScalaClass(message)
      assert(true, moreRobustScalaClass.preachScala().contains(message))
    }
  }


}