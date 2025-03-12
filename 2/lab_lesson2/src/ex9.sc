def subsets[A](set: Set[A]): Set[Set[A]] = {
  def subsetsPrime[A](l: List[A], acc: Set[Set[A]]): Set[Set[A]] = {
    l match {
      case Nil => acc
      case head :: tail =>
        val newSubsets = acc.map(item => item + head)
        subsetsPrime(tail, acc + Set() ++ newSubsets)
    }
  }

  subsetsPrime(set.toList, Set(Set())) // البدء من مجموعة تحتوي على المجموعة الفارغة
}

println(subsets(Set(1, 2, 3))) // Output: Set(Set(), Set(1), Set(2), Set(3), Set(1, 2), Set(1, 3), Set(2, 3), Set(1, 2, 3))
