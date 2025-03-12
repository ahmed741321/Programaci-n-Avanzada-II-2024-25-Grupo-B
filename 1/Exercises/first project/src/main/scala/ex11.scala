/*
Exercise: defines a recursive function that returns all binary strings of size n.
For example, those of size 3 are: "000", "001", "010", "011", "100",
"101", "110" y "111"
*/
def generateBinaryStrings(n: Int): List[String] = {
  if (n == 0) List("")
  else {
    val smaller = generateBinaryStrings(n - 1)
    smaller.map("0" + _) ::: smaller.map("1" + _)
  }
}

@main
def ex11(): Unit = {
  val n = 4
  val result = generateBinaryStrings(n)
  println(result.mkString(", "))  // طباعة جميع السلاسل الثنائية لطول n
}
