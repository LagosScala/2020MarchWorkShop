package com.lagosscala.learnobject

/**An object houses most static methods and variables
  * Since the Rectangle object has no changing values/methods.
  */
object RectangleObject {

  def area(breadth: Int, height: Int): Int = {
    breadth * height
  }

  def perimeter(breadth: Int, height: Int): Int = {
    2 * (breadth + height)
  }

}


object RectangleObjectApp extends App {

  println(RectangleObject.area(4, 5))
  println(RectangleObject.perimeter(4, 5))
}