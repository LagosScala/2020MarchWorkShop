package com.lagosscala.learnobject


/**
*
  * Traits are fundamental to code reuse in scala. It brings the concept of polymorphism to scala
  * However the concept of using traits in Scala makes use of the word mixing -- because you can basically bring in
  * different functions from several traits to make up your new class.
  *
  * This methodology presents widening thin interfaces to rich ones.
  *
  * When some methods are to be reused in multiple unrelated classes make it a trait.
  */

trait Shapes {
  def area(width:Int, height: Int) :Int

  def perimeter(width:Int, height: Int) : Int
}

class Rectangle extends Shapes {
  def area(width: Int, height: Int): Int = {
    width * height
  }

  def perimeter(width: Int, height: Int): Int = {
    2 + (width * height)
  }
}

class Square extends Shapes {
  def area(width: Int, height: Int): Int = {
      if (width != height) {
        println("Object is not square")
        -1
      }else {
        width * width
      }
  }

  def perimeter(width: Int, height: Int): Int = {
    (math.pow(width, 2)  * 2).toInt
  }
}

class Triangle extends Shapes {
   def area(width: Int, height: Int): Int = {
    (0.5 * (width * height)).toInt
  }

   def perimeter(width: Int, height: Int): Int = {
    2 * height + width
  }
}


object TraitApp extends App {
  val triangle =  new Triangle()
  println(triangle.area(5, 6))
  println(triangle.perimeter(5, 6))


  val rectangle = new Rectangle()
  println(rectangle.area(5, 6))
  println(rectangle.perimeter(5, 6))


  val square = new Square()
  println(square.area(5, 6))
  println(square.perimeter(5, 6))



}