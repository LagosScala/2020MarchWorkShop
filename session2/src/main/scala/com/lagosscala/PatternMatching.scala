package com.lagosscala

object PatternMatching {

  //simple constant patterns ( match is an expression )
  def matchIt(x : Any) : Unit = ???

  //variable loads
  def wordsAndOpposite(word : String): String = ???

  def wordsAndOpposite2(word : String) : String  = ???

  //Typed Pattern Matches
  /*
  * object obj = "A String Value";
  * if(obj instanceOf String) { do something }
  */
  def describeType(x : Any) = ???

  //Guards - Adds a predicate to a pattern match on the left side
  def describeNumber(num : Int) : String = ???



  //match tuples
  def matchTuple3(tup3 : (Int , Boolean , String)) : String = ???

  // pattern matching with case classes



  //pattern match with Val on tuples / case class ( Extractors )

  //for and pattern matching
}
