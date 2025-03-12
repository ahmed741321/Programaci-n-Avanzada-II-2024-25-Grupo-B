// Function to calculate the GCD using the Euclidean algorithm
def GCD(number1: Int, number2: Int): Int = {
  if (number2 == 0) number1 else GCD(number2, number1 % number2)
}

// Function to calculate the LCM
def LCM(number1: Int, number2: Int): Int = {
  if (number1 == 0 || number2 == 0) 0
  else (number1 * number2) / GCD(number1, number2)
}


@main
def ex5(): Unit = {
  // Example numbers
  val num1 = 12
  val num2 = 18

  // Calculate GCD and LCM
  val gcd = GCD(num1, num2)
  val lcm = LCM(num1, num2)

  // Print results
  println(s"GCD of $num1 and $num2 is: $gcd")
  println(s"LCM of $num1 and $num2 is: $lcm")
}
