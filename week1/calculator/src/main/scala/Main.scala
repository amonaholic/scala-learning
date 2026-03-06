import scala.io.StdIn

@main def hello(): Unit =
  
  println("Enter first number: ")
  val x = StdIn.readLine().toFloat

  println("Enter operator: ")
  val operator = StdIn.readLine()

  println("Enter second number: ")
  val y = StdIn.readLine().toFloat

  val result = {
    operator match
      case "+" => x + y
      case "-" => x - y
      case "*" => x * y
      case "/" => if y == 0 then println("Can't divide by 0") else x / y
      case _   => println("Invalid operator")
  }
  
  println(result)