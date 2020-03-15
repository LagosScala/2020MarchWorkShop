package com.lagosscala.learnobjects

import com.lagosscala.learnobject.{Rectangle, Square, Triangle}
import org.scalatest.wordspec.AnyWordSpec

class ShapeTraitTestSpec extends AnyWordSpec {
  val width = 5
  val height = 6
  val triangle = new Triangle()

  "Triangle class extended from Shapes" should {
    "Use its own area definition" in {
      assert(triangle.area(width, height) == (0.5 * width * height).toInt)
    }

    "Use its own perimeter definition" in {
      assert(triangle.perimeter(width , height) == 2 * height + width)
    }
  }

  val square = new Square()
  "Square class extended from Shapes" should {
    "Use its own area definition" in {
      assert(square.area(5, 5) == 5 * 5)
    }

    "Use its own perimeter definition" in {
      assert(square.perimeter(5, 5) == math.pow(5, 2) * 2)
    }
  }


  val rectangle = new Rectangle()
  "Rectangle class extended from Shapes" should {
    "Use its own area definition" in {
      assert(rectangle.area( width, height) == width * height )
    }

    "Use its own perimeter definition" in {
      assert(rectangle.perimeter(width, height) == 2 + (width * height))
    }
  }

}