def reduce[A](l: List[A], f: (A, A) => A): A = {
  l match {
    case Nil => throw new UnsupportedOperationException("empty list")
    case head :: Nil => head
    case head :: til => f(head, reduce(til, f)) // تطبيق الفونكشن على العنصر الأول وبقية العناصر
  }
}

val sum: (Int, Int) => Int = (x, y) => x + y
val numbers = List(1, 2, 3, 4, 5)
val result = reduce(numbers, sum) // النتيجة: 15