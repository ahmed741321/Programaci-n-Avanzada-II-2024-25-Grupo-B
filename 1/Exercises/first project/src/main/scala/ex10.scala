@main
def ex10(): Unit = {
  val words = List("hello", "to", "world", "scala", "is", "awesome")

  val result = words
    .map(_.toUpperCase) // Convert to uppercase
    .filter(_.length >= 4) // Filter words with 4 or more characters
    .map(_.length) // Get word lengths
    .foldLeft(0)((x, y) => x + y) // Compute the sum

  println(result) // Output the result
}