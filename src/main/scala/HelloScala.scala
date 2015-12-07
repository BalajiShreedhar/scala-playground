/**
  * Created by Balaji on 07-12-2015.
  */
object HelloScala extends App {

  println("hello Scalaaaaaaaaaaaaaaaa........")

  //variable
  var x = 40
  if (x < 30) println("X is lesser than 30")
  else println("X is greater than 30")


  //addition of two number
  //def is the scala function(can be method )
  def addInt(a: Int, b: Int): Int = {
    var sum = 0
    sum = a + b
    sum
  }

  println("Addition of numbers is " + addInt(3, 5))

  //function can be assigned to a value
  val sum = addInt(6, 11)
  println(sum)

  //If a function didn't return any value, then it is UNIT
  def printName(): Unit = {
    println("balaji")
  }

  printName()



  //call by name : passing the function as parameter to other function
  def printTime() = System.currentTimeMillis()

  def test(value: Long) = {
    println("Call by name functionality")
    println("Inside Test method")
    println("time = " + value)
  }

  test(printTime())


}
