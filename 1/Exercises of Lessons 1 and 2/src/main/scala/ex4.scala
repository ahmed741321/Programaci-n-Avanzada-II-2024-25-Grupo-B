import scala.io.StdIn

object PrimeNumbers {

  // Function to check if a number is prime
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else {
      for (i <- 2 to Math.sqrt(num).toInt) {
        if (num % i == 0) return false
      }
      true
    }
  }

  // Function to generate the first N prime numbers
  def generatePrimes(n: Int): List[Int] = {
    var primes = List[Int]()
    var num = 2 // Starting from the first prime number

    while (primes.length < n) {
      if (isPrime(num)) {
        primes = primes :+ num // Append the prime number to the list
      }
      num += 1 // Check the next number
    }
    primes
  }

  @main
  def ex4(): Unit = {
    println("Enter the number of prime numbers you want to print:")
    val n = StdIn.readInt() // Get user input for N
    val primeNumbers = generatePrimes(n)
    println(s"The first $n prime numbers are: ${primeNumbers.mkString(", ")}")
  }
}
