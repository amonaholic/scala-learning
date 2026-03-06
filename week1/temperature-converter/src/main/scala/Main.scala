import scala.io.StdIn

@main def hello(): Unit =
  
  print("Enter degrees: ")
  val degrees = StdIn.readLine().toDouble

  print("Celsius or Fahrenheit: ")
  val temperatureType = StdIn.readLine().toUpperCase()

  def calculate(degrees: Double, temperatureType: String): Option[Double] =
      temperatureType match
        case "C" => Some((degrees * 1.8) + 32)
        case "F" => Some((degrees - 32) * (5.0 / 9.0))
        case _ => None
    
  val result = calculate(degrees, temperatureType)
  
  result match
    case Some(result) => println(result)
    case None => println("Invalid temperature type")