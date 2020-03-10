package com.lagosscala.learnfunctions

import org.scalatest.wordspec.AnyWordSpec

class FunctionAsMethodsTestSpec extends AnyWordSpec {


  "Method area in object" should {
    "properly calculate area" in {
      assert(FunctionsAsMethods.area(3, 2) == 2 *( 3 * 2))
    }

    "properly respond given a string" in {
      assert(FunctionsAsMethods.speak("Abel") == "You just renamed me as Abel")
    }
  }
}