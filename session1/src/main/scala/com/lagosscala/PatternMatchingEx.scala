package com.lagosscala

case class Student (name : String , approved : Boolean)
case class Person(name : String , age : Int)

object PatternMatchingEx extends App{

  //simple constant patterns ( match is an expression )
  //Doesn't require a break statement
  def matchIt(x : Any) : Unit = x match {
    case 10 => println(s" The Number $x")
    case true => println(s" This is a boolean value of $x")
    case 2.0 => println(s" This is a double precision of $x")
    case "hello" => println( s" well hi there $x")
    case () => println(" This is a unit ")
    case _ => println (s" Bro, you are on your own $x")
  }

  /*
  matchIt(10)
  matchIt(true)
  matchIt(2.0)
  matchIt("hello")
  matchIt(())
  matchIt(3)
  */



  //variable loads
  def wordsAndOpposite(word : String): String = word match {
    case "hot" => "cold"
    case "full" => "empty"
    case "happy" => "sad"
    case anythingElse => s" not $anythingElse"
  }

  /*
  wordsAndOpposite("cool")
  wordsAndOpposite("hate")
*/

  //No default handler
  def wordsAndOpposite2(word : String) : String  = word match {
    case "hot" | "warm" => "cold"
    case "full" | "half full" => "empty"
    case "happy" => "sad"
  }

  /*
  wordsAndOpposite("hot")
  wordsAndOpposite("hate")
  */


  //Typed Pattern Matches
  /*
  * object obj = "A String Value";
  * if(obj instanceOf String) { do something }
  */

  def describeType(x : Any) = x match {
    case i : Int if i > 0 => s"Multiply ${i * i}"
    case d : Double => s"Double $d"
    case s : String => s"String reversed ${s.reverse}"
    case p : Person => s"Person Object   ${p.name} and ${p.age}"
    case _ => "Bro you are on your own"
  }

  println(s"${describeType(3)}")


  //Guards - Adds a predicate to a pattern match on the left side
  // Anything on the left of the "=>" is part of the pattern match, anything on the right is what to do
  def describeNumber(num : Int) : String = num match {
    case 0 => "Zero"
    case num if num > 0 && num <= 100     => "Between 0 and 100"
    case num if num > 100 && num <= 300   => "Between 100 and 300"
    case _                                =>"As usual, you are on your won "
  }

  println(s"${describeNumber(3)}")


  //match tuples
  def matchTuple3(tup3 : (Int , Boolean , String)) : String = tup3 match {
    case (1 , flag , strVal)  => s" Tuple consists of  [ 1 ] followed by [ $flag ] followed by [ $strVal ]"
    case (i , false , "yemi") => s" Tuple consists of  [ $i ] followed by [ false ] followed by [ yemi ]"
    case (a,b ,c) => s" Tuple consists of  [ $a ] followed by [ $b ] followed by [ $c ] "
  }
  println(s"${matchTuple3(3,false , "hello")}")


  // pattern matching with case classes
  def matchCaseClass(person : Person) : String = person match {
    case Person ("Ayo",10) => s"Person [ ${person} ]"
    case Person ("Check " , 54) => s"Person [ ${person} ]"
    case _ =>  s"We don't know this Person [ ${person} ]"
  }

  println(s"${matchCaseClass(Person ("Ayo" , 10))}")
  println(s"${matchCaseClass(Person ("Scala" , 10))}")

  //pattern match with Val on tuples / case class ( Extractors )
  val tup4: (Int, Boolean, String , String) = (20,true , "Scala" ,"JavaScript")
  val (a, b,c,d) = tup4
  println(s" This is a tuple of 4 : [ $a ]  followed by [ $b ]  followed by [ $c ] , followed by [ $d ]")



  //for and pattern matching
  val student1 = Student("Gbenga", false)
  val student2 = Student("Test", false)
  val student3 = Student("Tunwase", true)
  val student4 = Student("Corolla", true)
  val studentList = List(student1 , student2 , student3 , student4)

  val approvedStudentList: Seq[Student] = for {
    aStudent <- studentList
    if aStudent.approved
  }yield aStudent

  approvedStudentList.map(aStudent => println(aStudent))
}
