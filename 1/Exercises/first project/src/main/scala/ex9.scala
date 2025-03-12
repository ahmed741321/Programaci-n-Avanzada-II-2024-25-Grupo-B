import scala.annotation.tailrec
//Tail recursion: 3 factorials


def sumDigit(n: Int): Int = {
  var acc = 0
  var nn = n
  while (nn > 0) {
    acc += nn % 10
    nn = nn / 10
  }
  acc
}

def sumDigitRecursive(n: Int): Int = {
  if (n == 0) 0
  else (n % 10) + sumDigitRecursive(n / 10)
}


@tailrec
def sumDigitTailRec(n: Int, acc: Int = 0): Int = {
  if (n == 0) acc
  else sumDigitTailRec(n / 10, acc + (n % 10))
}

// duplicate
def duplicate[A](x: A): (A, A) =
  (x, x)

def twice[A](f: A => A, x: A): A =
  f(f(x))


// Data deconstruction
def add(x: Int, opt: Option[Int]): Option[Int] = opt match
  case None => None
  case Some(y) => Some(x + y)

def listPatternMatch(lst: List[Int]): String = lst match
  case Nil => "list is empty"
  case head :: tail => s"first element is $head and other $tail"



def sumSquares(xs: List[Int]): Int = xs match
  case Nil => 0 // إذا كانت القائمة فارغة، فإن المجموع هو 0
  case head :: tail => head * head + sumSquares(tail) // جمع مربع العنصر الأول مع باقي القائمة




@main
def ex9(): Unit = {
  println(sumDigit(123)) // 1 + 2 + 3 = 6
  println(sumDigitRecursive(123))
  println(sumDigitTailRec(123))

  val result1 = duplicate(1)
  println(result1)

  val result3 = twice((x: Int) => x * x, 2)
  println(result3)

  // Type Option
  val x: Option[Int] = Some(10) // يحتوي على قيمة 10
  val y: Option[Int] = None // لا يحتوي على أي قيمة
  val z = None // استنتاج نوعه تلقائيًا Option[Nothing]


  println(listPatternMatch(List())) // "القائمة فارغة"
  println(listPatternMatch(List(1, 2, 3))) // "العنصر الأول هو 1 وبقية القائمة List(2, 3)"

}

