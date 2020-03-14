package com.lagosscala


object CaseEx extends App{

  case class Student(firstName : String , lastName : String , age : Int , sex : String)
  // class parameters are fields , classes are instantiated without the "new" keyword

  val student1 = Student("Grace","John" , 24 , "Female")
  val student2 = Student("Grace","John" , 24 , "Female")
  val student3 = Student("Ahmed","Kabir" , 24 , "Male")

  println(student1.age)
  println(student2.lastName)

  // parameters are val by default , so you can't re-assign values to them
  // student1.age = 34 ----- won't work


  //Allows for Default and Partial Constructor values
  case class Book( id:Int = 1, title:String = " Scala - Java On Steroids ", isbn:Long = 2342348732474L)

  val book1 = Book()
  val book2 = Book(isbn = 100)
  val book3 = Book(title = "Lord of the Rings")

  println(book3.title)
  println(book2.id)

  //sensible toString()
  println(book1)

  //equals and hashCode implementation
  //you can compare individual variables / members of the class
  println(s"Comparison :::: ${student1 == student2}")

  //you can also compare for References
  println(s"Reference Equality  :::: ${student1 eq student2}")

  val student1Reference = student1
  println(s"Reference Equality  :::: ${student1 eq student1Reference}")

  //handy copy method
  val book1Copy = book1.copy() // full copy

  val book1PartialCopy = book1.copy(title = "The Lord of the Rings : The two towers") // partial copy

  //have extractors
  val Student(firstName , lastName , age , sex ) = student3

}
