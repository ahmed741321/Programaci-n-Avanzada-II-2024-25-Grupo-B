import scala.io.StdIn
import Console.{GREEN, RED, RESET, YELLOW_B, UNDERLINED}

object PrimeTest:
  def isPrime(candidate: Int): Boolean =
    if candidate < 2 then false
    else (2 until candidate).forall(candidate % _ != 0)

  def main(args: Array[String]): Unit =
    try
      print("Enter a number: ")
      val candidate = StdIn.readInt()
      if isPrime(candidate) then
        println(s"${RESET}${GREEN}yes${RESET}")
      else
        println(s"${RESET}${YELLOW_B}${RED}${UNDERLINED}NO!${RESET}")
    catch
      case _: NumberFormatException => println(s"${RED}Invalid input! Please enter a valid integer.${RESET}")
