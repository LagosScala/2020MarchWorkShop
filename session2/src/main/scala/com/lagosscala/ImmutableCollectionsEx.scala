package com.lagosscala

object ImmutableCollectionsEx extends App {

  //Immutable
  val firstVector = Vector("a","b","c","d","e","f")

  val secondVector = Vector("great","h","illum","j","karaoke","l")

  //Access Elements by Index
  println(s" Element at 3rd Position ::: $firstVector(3)")

  //Modifying a vector to add new elements , however this returns a new vector
  val thirdVector = firstVector ++ secondVector
  println(s" Elements of  3rd Vector ::: $thirdVector")

  // you can also update and replace one element in a vector , this returns a new vector
  var fourthVector = thirdVector.updated(4 ,"new")
  println(s" Elements of  4th Vector ::: $fourthVector")

  // this is also possible since its been assigned to a var
  fourthVector = fourthVector.filter(_.length > 1)
  println(s" Elements of  4th Vector ::: $fourthVector")

  // transform via map
  println(s" Elements of  Vector ::: ${fourthVector.map(_.capitalize)}")


  val intList: List[Int] = List.range(11, 35)

  //drop : drops the number of elements specified from the beginning
  println(s" Drop   ::: ${intList.drop(3)}")

  //dropWhile : drop elements as long as the predicate is true
  println(s" Drop  While  ::: ${intList.dropWhile(_ < 24)}")

  //dropRight : drops the number of elements specified from the end
  println(s" Drop Right  ::: ${intList.dropRight(3)}")

  //head : returns first element
  println(s" Head   ::: ${intList.head}")

  //headOption : returns first element as Option
  println(s" Head Option  ::: ${intList.headOption}")


  //groupBy : partitions the collection into a Map of sub-collections based on your function
  val booleanToInts: Map[Boolean, List[Int]] = intList.groupBy(_ > 23)

  //The true map contains the elements for which your predicate returned true
  println(s" true Map  ::: ${booleanToInts(true)}")

  //The false map contains the elements for which your predicate returned false
  println(s" False Map  ::: ${booleanToInts(false)}")

  //reduceLeft : walk through a sequence from left to right , and take the first 2 elements,
  //compute and compare with the next element till you reach the end of the sequence

  //intList.reduceLeft(( x,y) => x + y )
  println(s" Reduce Left  ::: ${intList.reduceLeft(_ + _)}")

  //reduceRight : walk through a sequence from left to right , and take the first 2 elements,
  //compute and compare with the next element till you reach the end of the sequence

  //intList.reduceRight(( x,y) => x - y )
  println(s" Reduce Right  ::: ${intList.reduceRight(_ - _)}")

  def checkLongerString(x : String , y : String)= if (x.length > y.length) x else y
  //find the longest string
  println(s" Longest String   ::: ${thirdVector.reduceLeft(checkLongerString)}")
}
