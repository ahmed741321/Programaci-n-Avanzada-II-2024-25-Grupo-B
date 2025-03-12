
// دالة تكرارية لحساب مجموع الأرقام (غير ذي ذيل)
def sumOfDigits(n: Int): Int = {
  if (n == 0) 0
  else n % 10 + sumOfDigits(n / 10)
}

// دالة تكرارية ذات ذيل لحساب مجموع الأرقام
def sumOfDigitsTailRecursive(n: Int, accumulator: Int = 0): Int = {
  if (n == 0) accumulator
  else sumOfDigitsTailRecursive(n / 10, accumulator + (n % 10))
}

@main
def ex21(): Unit = {
  val number = 12345

  // حساب مجموع الأرقام باستخدام الدالة التكرارية
  val sum = sumOfDigits(number)
  println(s"Sum of digits (recursive): $sum")

  // حساب مجموع الأرقام باستخدام الدالة ذات الذيل
  val tailSum = sumOfDigitsTailRecursive(number)
  println(s"Sum of digits (tail-recursive): $tailSum")
}

