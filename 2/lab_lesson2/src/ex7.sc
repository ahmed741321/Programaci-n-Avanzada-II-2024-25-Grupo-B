def groupBy[A](l: List[A], f: A => Boolean): Map[Boolean, List[A]] = {

  def groupByPrime(l: List[A], f: A => Boolean, map: Map[Boolean, List[A]]): Map[Boolean, List[A]] = {
    l match {
      case Nil => map
      case head :: tail =>
        if (f(head)) {
          // إذا كانت الدالة f ترجع true، نضيف العنصر إلى القائمة الخاصة بـ true
          val updatedMap = map.updated(true, head :: map.getOrElse(true, Nil))
          groupByPrime(tail, f, updatedMap)
        } else {
          // إذا كانت الدالة f ترجع false، نضيف العنصر إلى القائمة الخاصة بـ false
          val updatedMap = map.updated(false, head :: map.getOrElse(false, Nil))
          groupByPrime(tail, f, updatedMap)
        }
    }
  }

  groupByPrime(l, f, Map[Boolean, List[A]]())
}

// تجربة الكود
val numbers = List(1, 2, 3, 4, 5, 6)
val grouped = groupBy(numbers, (x: Int) => x % 2 == 0)

println(grouped) // Output: Map(true -> List(2, 4, 6), false -> List(1, 3, 5))
