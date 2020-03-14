package com.lagosscala.learnobjects

import com.lagosscala.learnobject.RectangleObject
import org.scalatest.wordspec.AnyWordSpec

class RectangleObjectTestSpec extends AnyWordSpec {

  val breadth = 5
  val height = 4

  "Rectangle Object" should {
    "Correctly calculate area " in {
      val area = RectangleObject.area(breadth, height)
      assert(breadth * height == area)
    }

    "Correctly calculate perimeter" in {
      val perimeter = RectangleObject.perimeter(breadth, height)
      assert(2 *(breadth + height) == perimeter)
    }
  }

}