package com.lagosscala

import scala.collection.mutable.ArrayBuffer

object MutableCollectionsEx extends App{

  var numsArray = ArrayBuffer(1,2,3,4,5,6,7,8,9,10)

  //Add two or more elements
  numsArray += (11,12,13)
  println(s" Elements of  NumsArray ::: $numsArray")

  // Prepend
  numsArray.prepend(-3,-2,-1,0)
  println(s" Prepend NumsArray ::: $numsArray")

  private val intsArray = ArrayBuffer.range(11, 35)
  println(s" Ints ArrayBuffer ::: ${intsArray}")


  //Take : takes the number of elements specified from the beginning
  println(s" Take  Array ::: ${intsArray.take(3)}")

  //takeWhile : take elements as long as the predicate is true
  println(s" Take  While Array ::: ${intsArray.takeWhile(_ < 24)}")

  //takeRight : take the number of elements specified from the end
  println(s" Take Right Array ::: ${intsArray.takeRight(3)}")

  //tail : returns all elements except the first element
  println(s" tail   ::: ${intsArray.tail}")

  //last : returns last element
  println(s" last   ::: ${intsArray.last}")

  //lastOption : returns last element as Option
  println(s" last Option  ::: ${intsArray.lastOption}")

  //partition : create a Tuple2 of sequences that are of the same type as the original collection
  val tupleInts: (ArrayBuffer[Int], ArrayBuffer[Int]) = numsArray.partition(_ > 7)

  println(s" Tuple 1  ::: ${tupleInts._1}")
  println(s" Tuple 2  ::: ${tupleInts._2}")

  //foldLeft : Works like the reduceLeft , but it allows to seed a value
  println(s" Fold Left ::: ${intsArray.foldLeft(20)(_ + _)}")

  //foldRight : Works like the reduceRight , but it allows to seed a value
  println(s" Fold Left ::: ${intsArray.foldRight(20)(_ - _)}")

  //looping over a collection
  //numsArray.foreach((i:Int) => println(i))
  //or
  //numsArray.foreach(i => println(i))
  //or
  //numsArray.foreach(println(_))
  //or
  //numsArray.foreach(println)

}
