def filter[A](l: List[A], f: A => Boolean): List[A] = {
  l match {
    case Nil => Nil // إذا كانت القائمة فارغة، نرجع قائمة فارغة
    case head :: tail =>
      if (f(head)) head :: filter(tail, f) // إذا كانت الدالة `f` ترجع true نضيف `head` للقائمة الجديدة
      else filter(tail, f) // إذا كانت الدالة `f` ترجع false نتجاهل `head`
  }
}

val numbers = List(1, 2, 3, 4, 5, 6)
val evenNumbers = filter(numbers, (x: Int) => x % 2 == 0)

println(evenNumbers) // Output: List(2, 4, 6)
